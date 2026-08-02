package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.google.common.collect.ImmutableList;
import defpackage.cuh0;
import defpackage.d06;
import defpackage.e001;
import defpackage.i0i0;
import defpackage.n001;
import defpackage.oe7;
import defpackage.q801;
import defpackage.u001;
import defpackage.v001;
import defpackage.xzz0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public class TrackSelectionView extends LinearLayout {
    private boolean allowAdaptiveSelections;
    private boolean allowMultipleOverrides;
    private final ComponentListener componentListener;
    private final CheckedTextView defaultView;
    private final CheckedTextView disableView;
    private final LayoutInflater inflater;
    private boolean isDisabled;
    private v001 listener;
    private final Map<xzz0, n001> overrides;
    private final int selectableItemBackgroundResourceId;
    private final List<q801> trackGroups;
    private Comparator<u001> trackInfoComparator;
    private e001 trackNameProvider;
    private CheckedTextView[][] trackViews;

    public class ComponentListener implements View.OnClickListener {
        private ComponentListener() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.onClick(view);
        }
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.selectableItemBackgroundResourceId = resourceId;
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.inflater = from;
        ComponentListener componentListener = new ComponentListener();
        this.componentListener = componentListener;
        this.trackNameProvider = new d06(getResources(), 1);
        this.trackGroups = new ArrayList();
        this.overrides = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.disableView = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(i0i0.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(componentListener);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(cuh0.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.defaultView = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(i0i0.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(componentListener);
        addView(checkedTextView2);
    }

    public static Map<xzz0, n001> filterOverrides(Map<xzz0, n001> map, List<q801> list, boolean z) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            n001 n001Var = map.get(list.get(i).b);
            if (n001Var != null && (z || hashMap.isEmpty())) {
                hashMap.put(n001Var.a, n001Var);
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lambda$init$0(Comparator comparator, u001 u001Var, u001 u001Var2) {
        return comparator.compare(u001Var.a.a(u001Var.b), u001Var2.a.a(u001Var2.b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onClick(View view) {
        if (view == this.disableView) {
            onDisableViewClicked();
        } else if (view == this.defaultView) {
            onDefaultViewClicked();
        } else {
            onTrackViewClicked(view);
        }
        updateViewStates();
    }

    private void onDefaultViewClicked() {
        this.isDisabled = false;
        this.overrides.clear();
    }

    private void onDisableViewClicked() {
        this.isDisabled = true;
        this.overrides.clear();
    }

    private void onTrackViewClicked(View view) {
        this.isDisabled = false;
        Object tag = view.getTag();
        tag.getClass();
        u001 u001Var = (u001) tag;
        q801 q801Var = u001Var.a;
        xzz0 xzz0Var = q801Var.b;
        int i = u001Var.b;
        n001 n001Var = this.overrides.get(xzz0Var);
        if (n001Var == null) {
            if (!this.allowMultipleOverrides && this.overrides.size() > 0) {
                this.overrides.clear();
            }
            this.overrides.put(xzz0Var, new n001(xzz0Var, ImmutableList.r(Integer.valueOf(i))));
            return;
        }
        ArrayList arrayList = new ArrayList(n001Var.b);
        boolean isChecked = ((CheckedTextView) view).isChecked();
        boolean shouldEnableAdaptiveSelection = shouldEnableAdaptiveSelection(q801Var);
        boolean z = shouldEnableAdaptiveSelection || shouldEnableMultiGroupSelection();
        if (isChecked && z) {
            arrayList.remove(Integer.valueOf(i));
            boolean isEmpty = arrayList.isEmpty();
            Map<xzz0, n001> map = this.overrides;
            if (isEmpty) {
                map.remove(xzz0Var);
                return;
            } else {
                map.put(xzz0Var, new n001(xzz0Var, arrayList));
                return;
            }
        }
        if (isChecked) {
            return;
        }
        if (!shouldEnableAdaptiveSelection) {
            this.overrides.put(xzz0Var, new n001(xzz0Var, ImmutableList.r(Integer.valueOf(i))));
        } else {
            arrayList.add(Integer.valueOf(i));
            this.overrides.put(xzz0Var, new n001(xzz0Var, arrayList));
        }
    }

    private boolean shouldEnableAdaptiveSelection(q801 q801Var) {
        return this.allowAdaptiveSelections && q801Var.c;
    }

    private boolean shouldEnableMultiGroupSelection() {
        return this.allowMultipleOverrides && this.trackGroups.size() > 1;
    }

    private void updateViewStates() {
        this.disableView.setChecked(this.isDisabled);
        this.defaultView.setChecked(!this.isDisabled && this.overrides.size() == 0);
        for (int i = 0; i < this.trackViews.length; i++) {
            n001 n001Var = this.overrides.get(this.trackGroups.get(i).b);
            int i2 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.trackViews[i];
                if (i2 < checkedTextViewArr.length) {
                    if (n001Var != null) {
                        Object tag = checkedTextViewArr[i2].getTag();
                        tag.getClass();
                        this.trackViews[i][i2].setChecked(n001Var.b.contains(Integer.valueOf(((u001) tag).b)));
                    } else {
                        checkedTextViewArr[i2].setChecked(false);
                    }
                    i2++;
                }
            }
        }
    }

    private void updateViews() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        boolean isEmpty = this.trackGroups.isEmpty();
        CheckedTextView checkedTextView = this.disableView;
        if (isEmpty) {
            checkedTextView.setEnabled(false);
            this.defaultView.setEnabled(false);
            return;
        }
        checkedTextView.setEnabled(true);
        this.defaultView.setEnabled(true);
        this.trackViews = new CheckedTextView[this.trackGroups.size()][];
        boolean shouldEnableMultiGroupSelection = shouldEnableMultiGroupSelection();
        for (int i = 0; i < this.trackGroups.size(); i++) {
            q801 q801Var = this.trackGroups.get(i);
            boolean shouldEnableAdaptiveSelection = shouldEnableAdaptiveSelection(q801Var);
            CheckedTextView[][] checkedTextViewArr = this.trackViews;
            int i2 = q801Var.a;
            checkedTextViewArr[i] = new CheckedTextView[i2];
            u001[] u001VarArr = new u001[i2];
            for (int i3 = 0; i3 < q801Var.a; i3++) {
                u001VarArr[i3] = new u001(q801Var, i3);
            }
            Comparator<u001> comparator = this.trackInfoComparator;
            if (comparator != null) {
                Arrays.sort(u001VarArr, comparator);
            }
            for (int i4 = 0; i4 < i2; i4++) {
                if (i4 == 0) {
                    addView(this.inflater.inflate(cuh0.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView2 = (CheckedTextView) this.inflater.inflate((shouldEnableAdaptiveSelection || shouldEnableMultiGroupSelection) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView2.setBackgroundResource(this.selectableItemBackgroundResourceId);
                e001 e001Var = this.trackNameProvider;
                u001 u001Var = u001VarArr[i4];
                checkedTextView2.setText(((d06) e001Var).d(u001Var.a.a(u001Var.b)));
                checkedTextView2.setTag(u001VarArr[i4]);
                if (q801Var.d(i4)) {
                    checkedTextView2.setFocusable(true);
                    checkedTextView2.setOnClickListener(this.componentListener);
                } else {
                    checkedTextView2.setFocusable(false);
                    checkedTextView2.setEnabled(false);
                }
                this.trackViews[i][i4] = checkedTextView2;
                addView(checkedTextView2);
            }
        }
        updateViewStates();
    }

    public boolean getIsDisabled() {
        return this.isDisabled;
    }

    public Map<xzz0, n001> getOverrides() {
        return this.overrides;
    }

    public void init(List<q801> list, boolean z, Map<xzz0, n001> map, Comparator<androidx.media3.common.a> comparator, v001 v001Var) {
        this.isDisabled = z;
        this.trackInfoComparator = comparator == null ? null : new oe7(14, comparator);
        this.trackGroups.clear();
        this.trackGroups.addAll(list);
        this.overrides.clear();
        this.overrides.putAll(filterOverrides(map, list, this.allowMultipleOverrides));
        updateViews();
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.allowAdaptiveSelections != z) {
            this.allowAdaptiveSelections = z;
            updateViews();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.allowMultipleOverrides != z) {
            this.allowMultipleOverrides = z;
            if (!z && this.overrides.size() > 1) {
                Map<xzz0, n001> filterOverrides = filterOverrides(this.overrides, this.trackGroups, false);
                this.overrides.clear();
                this.overrides.putAll(filterOverrides);
            }
            updateViews();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.disableView.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(e001 e001Var) {
        e001Var.getClass();
        this.trackNameProvider = e001Var;
        updateViews();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context) {
        this(context, null);
    }
}
