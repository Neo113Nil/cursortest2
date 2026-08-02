package com.yandex.div.core.view2.errors;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.data.Variable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.c5g;
import xsna.e43;
import xsna.izs;
import xsna.j5g;
import xsna.ou4;
import xsna.s3q0;

/* compiled from: VariableMonitorView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public final class VariableMonitorView extends LinearLayout {
    private final Context context;
    private final LinearLayout title;
    private final VariableAdapter variablesAdapter;

    /* compiled from: VariableMonitorView.kt */
    /* renamed from: com.yandex.div.core.view2.errors.VariableMonitorView$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements izs<List<? extends Pair<? extends String, ? extends Variable>>, s3q0> {
        public AnonymousClass1(Object obj) {
            super(1, obj, VariableMonitorView.class, "updateTable", "updateTable(Ljava/util/List;)V", 0);
        }

        @Override // xsna.izs
        public /* bridge */ /* synthetic */ s3q0 invoke(List<? extends Pair<? extends String, ? extends Variable>> list) {
            invoke2((List<? extends Pair<String, ? extends Variable>>) list);
            return s3q0.a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Pair<String, ? extends Variable>> list) {
            ((VariableMonitorView) this.receiver).updateTable(list);
        }
    }

    public VariableMonitorView(Context context, VariableMonitor variableMonitor) {
        super(context);
        this.context = context;
        this.variablesAdapter = new VariableAdapter(new VariableMonitorView$variablesAdapter$1(variableMonitor));
        LinearLayout createTableTitle = createTableTitle();
        this.title = createTableTitle;
        setOrientation(1);
        variableMonitor.setVariablesUpdatedCallback(new AnonymousClass1(this));
        addView(createTableTitle, new LinearLayout.LayoutParams(-1, -2));
        addView(createTable(), new LinearLayout.LayoutParams(-1, -2));
    }

    private final TextView createCellTitle(String str) {
        TextView textView = new TextView(this.context);
        int dpToPx = BaseDivViewExtensionsKt.dpToPx(8, textView.getResources().getDisplayMetrics());
        textView.setPadding(dpToPx, dpToPx, dpToPx, dpToPx);
        textView.setTextColor(-1);
        textView.setText(str);
        textView.setTypeface(textView.getTypeface(), 1);
        return textView;
    }

    private final RecyclerView createTable() {
        RecyclerView recyclerView = new RecyclerView(this.context);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.variablesAdapter);
        recyclerView.setBackgroundColor(Color.argb(50, 0, 0, 0));
        return recyclerView;
    }

    private final LinearLayout createTableTitle() {
        LinearLayout linearLayout = new LinearLayout(this.context);
        List l = e43.l(200, 60, 100);
        List l2 = e43.l("name", "type", "value");
        ArrayList arrayList = new ArrayList(c5g.u(l2, 10));
        Iterator it = l2.iterator();
        while (it.hasNext()) {
            arrayList.add(createCellTitle((String) it.next()));
        }
        Iterator it2 = j5g.X0(arrayList, l).iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            linearLayout.addView((TextView) pair.d(), new LinearLayout.LayoutParams(BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(((Number) pair.g()).intValue()), linearLayout.getResources().getDisplayMetrics()), -2));
        }
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTable(List<? extends Pair<String, ? extends Variable>> list) {
        VariableModel model;
        VariableAdapter variableAdapter = this.variablesAdapter;
        List<? extends Pair<String, ? extends Variable>> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            model = VariableMonitorViewKt.toModel((Variable) pair.g(), (String) pair.d());
            arrayList.add(model);
        }
        variableAdapter.submitList(arrayList, new ou4(this, 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateTable$lambda$5(VariableMonitorView variableMonitorView) {
        variableMonitorView.title.setVisibility(variableMonitorView.variablesAdapter.getItemCount() != 0 ? 0 : 8);
    }
}
