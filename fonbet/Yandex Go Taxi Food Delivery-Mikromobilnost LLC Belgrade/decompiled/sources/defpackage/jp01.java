package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.b;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.design.view.GoView;
import com.yandex.go.transfer_requirement.analytics.TransferCardAnalytics$TransferType;
import com.yandex.go.transfer_requirement.mvp.TransferRequirementModalView;
import com.yandex.go.transfer_requirement.ui.flight_input.TransferNumberInputView;
import defpackage.ih01;
import defpackage.kcz0;
import defpackage.op01;
import defpackage.tje;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.CounterComponent;
import ru.yandex.taxi.design.ListGroupHeaderComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.tooltips.SummaryTooltipAlignment;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class jp01 implements ep01 {
    public final /* synthetic */ TransferRequirementModalView a;

    public jp01(TransferRequirementModalView transferRequirementModalView) {
        this.a = transferRequirementModalView;
    }

    @Override // defpackage.ep01
    public final void applyStyle(String str) {
        pwy0 pwy0Var;
        TransferRequirementModalView transferRequirementModalView = this.a;
        transferRequirementModalView.styleName = str;
        pwy0Var = transferRequirementModalView.themeSwitcherProvider;
        transferRequirementModalView.updateThemeAndStyle(pwy0Var.getThemeType(), str);
    }

    @Override // defpackage.ep01
    public final void close() {
        this.a.onBackPressed();
    }

    public final void h(Drawable drawable) {
        kp01 binding;
        int shadowMargin;
        int shadowMargin2;
        int shadowMargin3;
        TransferRequirementModalView transferRequirementModalView = this.a;
        binding = transferRequirementModalView.getBinding();
        if (drawable == null) {
            binding.f.setVisibility(8);
            xw31.E(binding.e, null, 0, null, null);
            xw31.E(binding.m, null, null, null, 0);
            return;
        }
        GoView goView = binding.f;
        goView.setVisibility(0);
        Rect rect = new Rect();
        drawable.getPadding(rect);
        Integer valueOf = Integer.valueOf(-rect.left);
        int i = -rect.top;
        shadowMargin = transferRequirementModalView.getShadowMargin();
        xw31.E(goView, valueOf, Integer.valueOf(shadowMargin + i), Integer.valueOf(-rect.right), Integer.valueOf(-rect.bottom));
        GoLinearLayout goLinearLayout = binding.e;
        shadowMargin2 = transferRequirementModalView.getShadowMargin();
        xw31.E(goLinearLayout, null, Integer.valueOf(shadowMargin2), null, null);
        GoLinearLayout goLinearLayout2 = binding.m;
        shadowMargin3 = transferRequirementModalView.getShadowMargin();
        xw31.E(goLinearLayout2, null, null, null, Integer.valueOf(-shadowMargin3));
        goView.setBackgroundDrawable(drawable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x028c, code lost:
    
        if ((r8 == null ? false : r8.a.q(8)) == false) goto L98;
     */
    @Override // defpackage.ep01
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y1(sp01 sp01Var) {
        kp01 binding;
        kp01 binding2;
        kp01 binding3;
        kp01 binding4;
        kp01 binding5;
        kp01 binding6;
        kp01 binding7;
        kp01 binding8;
        kp01 binding9;
        kp01 binding10;
        kp01 binding11;
        kp01 binding12;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        kp01 binding13;
        ArrayList arrayList5;
        kp01 binding14;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        kp01 binding15;
        kp01 binding16;
        if (!(sp01Var instanceof qp01)) {
            if (sp01Var instanceof rp01) {
                return;
            }
            w511.b();
            return;
        }
        qp01 qp01Var = (qp01) sp01Var;
        CharSequence charSequence = qp01Var.a;
        final TransferRequirementModalView transferRequirementModalView = this.a;
        binding = transferRequirementModalView.getBinding();
        ListHeaderComponent listHeaderComponent = binding.b;
        int i = 8;
        listHeaderComponent.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        if (charSequence != null) {
            listHeaderComponent.setTitle(charSequence);
        }
        xh01 xh01Var = qp01Var.b;
        binding2 = transferRequirementModalView.getBinding();
        binding2.x.setVisibility(xh01Var != null ? 0 : 8);
        if (xh01Var != null) {
            binding16 = transferRequirementModalView.getBinding();
            binding16.x.setSelectorItems(xh01Var.a);
        }
        axq0 axq0Var = qp01Var.c;
        binding3 = transferRequirementModalView.getBinding();
        if (axq0Var == null) {
            binding3.k.setVisibility(8);
            binding3.v.setVisibility(8);
            binding3.w.setVisibility(8);
            binding3.u.setVisibility(8);
            binding3.h.setVisibility(8);
            binding3.g.setVisibility(8);
        } else {
            rnr rnrVar = axq0Var.c;
            cu01 cu01Var = axq0Var.b;
            TransferNumberInputView transferNumberInputView = binding3.k;
            TransferNumberInputView transferNumberInputView2 = binding3.u;
            ListItemComponent listItemComponent = binding3.g;
            ListItemSwitchComponent listItemSwitchComponent = binding3.h;
            transferNumberInputView.setValidationMode(axq0Var.e ? TransferNumberInputView.ValidationMode.FLIGHT_NUMBER : TransferNumberInputView.ValidationMode.PLAIN_TEXT);
            TransferNumberInputView transferNumberInputView3 = binding3.k;
            rnr rnrVar2 = axq0Var.a;
            if (rnrVar2 == null) {
                transferNumberInputView3.setVisibility(8);
            } else {
                transferNumberInputView3.setVisibility(0);
                transferNumberInputView3.render(rnrVar2);
            }
            binding3.v.setVisibility(((cu01Var != null) || (rnrVar != null)) ? 0 : 8);
            binding4 = transferRequirementModalView.getBinding();
            if (cu01Var == null) {
                binding4.w.setVisibility(8);
            } else {
                AnimatedListItemInputComponent animatedListItemInputComponent = binding4.w;
                animatedListItemInputComponent.setVisibility(0);
                TextView title = animatedListItemInputComponent.title();
                title.setTextSize(13.0f);
                title.setText(cu01Var.a);
                title.setTextColor(qje.t(xng0.textMinor, title.getContext()));
                animatedListItemInputComponent.setInputTextColor(qje.t(xng0.textMinor, transferRequirementModalView.getContext()));
                animatedListItemInputComponent.setValue(cu01Var.b);
                animatedListItemInputComponent.setLeadImage(cu01Var.c);
                animatedListItemInputComponent.getInput().setFocusable(0);
                animatedListItemInputComponent.getInput().setFocusable(false);
                animatedListItemInputComponent.getInput().setFocusableInTouchMode(false);
                animatedListItemInputComponent.getInput().setLongClickable(false);
                animatedListItemInputComponent.getInput().setTextIsSelectable(false);
            }
            if (rnrVar == null) {
                transferNumberInputView2.setVisibility(8);
            } else {
                transferNumberInputView2.setVisibility(0);
                transferNumberInputView2.render(rnrVar);
            }
            transferNumberInputView2.setValidationMode(TransferNumberInputView.ValidationMode.PLAIN_TEXT);
            szz szzVar = axq0Var.d;
            if (szzVar instanceof rzz) {
                listItemComponent.setVisibility(8);
                listItemComponent.setOnClickListener(null);
                binding7 = transferRequirementModalView.getBinding();
                binding7.g.setTrailMode(0);
                vzz vzzVar = ((rzz) szzVar).a;
                binding8 = transferRequirementModalView.getBinding();
                if (vzzVar == null) {
                    ListItemSwitchComponent listItemSwitchComponent2 = binding8.h;
                    listItemSwitchComponent2.setVisibility(8);
                    listItemSwitchComponent2.getLeadImageView().setOnClickListener(null);
                    listItemSwitchComponent2.setOnLongClickListener(null);
                } else {
                    ListItemSwitchComponent listItemSwitchComponent3 = binding8.h;
                    listItemSwitchComponent3.setVisibility(0);
                    listItemSwitchComponent3.setTitle(vzzVar.a);
                    listItemSwitchComponent3.setSubtitle(vzzVar.b);
                    listItemSwitchComponent3.setLeadImage(vzzVar.c);
                    listItemSwitchComponent3.setCheckedWithAnimation(vzzVar.d);
                }
            } else if (szzVar instanceof qzz) {
                listItemSwitchComponent.setVisibility(8);
                listItemSwitchComponent.getLeadImageView().setOnClickListener(null);
                listItemSwitchComponent.setOnLongClickListener(null);
                uzz uzzVar = ((qzz) szzVar).a;
                binding6 = transferRequirementModalView.getBinding();
                binding6.g.setVisibility(0);
                CounterComponent counterComponent = new CounterComponent(transferRequirementModalView.getContext(), null, 0, 6, null);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 16);
                int u = tje.u(4, counterComponent.getContext());
                layoutParams.topMargin = u;
                layoutParams.bottomMargin = u;
                layoutParams.setMarginEnd(tje.u(16, counterComponent.getContext()));
                counterComponent.setLayoutParams(layoutParams);
                counterComponent.setValueChangedListener(new eze() { // from class: com.yandex.go.transfer_requirement.mvp.b
                    @Override // defpackage.eze
                    public final void a(int i2) {
                        op01 op01Var;
                        op01Var = TransferRequirementModalView.this.presenter;
                        kcz0 kcz0Var = op01Var.x;
                        boolean c = op01Var.A.c();
                        ih01 ih01Var = (ih01) kcz0Var.a;
                        TransferCardAnalytics$TransferType p = kcz0.p(c);
                        ih01Var.getClass();
                        HashMap hashMap = new HashMap();
                        hashMap.put("transfer_type", p.getEventValue());
                        hashMap.put("value", Integer.valueOf(i2));
                        ih01Var.a.a("TransferCard.LuggageCounter.Changed", hashMap, 1, new HashMap());
                        tje.N(op01Var.Jg(), null, null, new TransferRequirementModalViewPresenter$onLuggageCountUpdated$1(op01Var, i2, null), 3);
                    }
                });
                ListItemComponent listItemComponent2 = binding6.g;
                listItemComponent2.setTitle(uzzVar.a);
                listItemComponent2.setSubtitle(uzzVar.b);
                listItemComponent2.setLeadImage(uzzVar.c);
                listItemComponent2.setTrailMode(3);
                listItemComponent2.setTrailView(counterComponent);
                counterComponent.setMinMaxValues(0, uzzVar.e);
                counterComponent.setValue(uzzVar.d);
                counterComponent.setEnabled(true);
                counterComponent.invalidateComponent();
                tzz tzzVar = uzzVar.f;
                if (tzzVar != null) {
                    listItemComponent2.setDebounceClickListener(new t601(6, transferRequirementModalView, tzzVar));
                } else {
                    listItemComponent2.setOnClickListener(null);
                }
            } else {
                if (szzVar != null) {
                    w511.b();
                    return;
                }
                listItemSwitchComponent.setVisibility(8);
                listItemComponent.setVisibility(8);
                listItemSwitchComponent.getLeadImageView().setOnClickListener(null);
                listItemSwitchComponent.setOnLongClickListener(null);
                listItemComponent.setOnClickListener(null);
                binding5 = transferRequirementModalView.getBinding();
                binding5.g.setTrailMode(0);
            }
        }
        fh10 fh10Var = qp01Var.d;
        binding9 = transferRequirementModalView.getBinding();
        ListGroupHeaderComponent listGroupHeaderComponent = binding9.j;
        listGroupHeaderComponent.setVisibility(fh10Var != null ? 0 : 8);
        listGroupHeaderComponent.setTitle(fh10Var != null ? fh10Var.a : null);
        binding9.i.setVisibility(((fh10Var != null ? fh10Var.c : null) == null || fh10Var.b == null) ? 8 : 0);
        ibs0 ibs0Var = fh10Var != null ? fh10Var.c : null;
        binding10 = transferRequirementModalView.getBinding();
        if (ibs0Var == null) {
            binding10.s.setVisibility(8);
        } else {
            AnimatedListItemInputComponent animatedListItemInputComponent2 = binding10.s;
            animatedListItemInputComponent2.setVisibility(0);
            animatedListItemInputComponent2.title().setText(ibs0Var.a);
            if (binding10.s.getInputFocused()) {
                WeakHashMap weakHashMap = b.a;
                n751 a = op31.a(transferRequirementModalView);
            }
            String str = ibs0Var.c;
            if (str == null) {
                str = "";
            }
            animatedListItemInputComponent2.setValue(str);
            animatedListItemInputComponent2.setLeadImage(ibs0Var.b);
            String str2 = ibs0Var.d;
            transferRequirementModalView.tooltip = new mr31(str2 == null ? "" : str2, null, false, null, 17, null, SummaryTooltipAlignment.CENTER, null, 7894);
            transferRequirementModalView.updateTooltipHelper();
        }
        wk90 wk90Var = fh10Var != null ? fh10Var.b : null;
        binding11 = transferRequirementModalView.getBinding();
        if (wk90Var == null) {
            binding11.l.setVisibility(8);
        } else {
            ListItemComponent listItemComponent3 = binding11.l;
            listItemComponent3.setVisibility(0);
            listItemComponent3.setTitle(wk90Var.a);
            listItemComponent3.setSubtitle(wk90Var.c);
            listItemComponent3.setLeadImage(wk90Var.b);
        }
        ikl0 ikl0Var = qp01Var.e;
        binding12 = transferRequirementModalView.getBinding();
        if (ikl0Var == null) {
            binding12.n.setVisibility(8);
            binding12.m.setVisibility(8);
        } else {
            List list = ikl0Var.b;
            ListGroupHeaderComponent listGroupHeaderComponent2 = binding12.n;
            listGroupHeaderComponent2.setVisibility(0);
            listGroupHeaderComponent2.setTitle(ikl0Var.a);
            GoLinearLayout goLinearLayout = binding12.m;
            goLinearLayout.setVisibility(0);
            goLinearLayout.setDividerDrawable(vng.t(q4h0.transfer_item_divider, goLinearLayout.getContext()));
            int size = list.size();
            arrayList = transferRequirementModalView.ruleViewsCache;
            if (arrayList.size() > size) {
                binding14 = transferRequirementModalView.getBinding();
                GoLinearLayout goLinearLayout2 = binding14.m;
                arrayList6 = transferRequirementModalView.ruleViewsCache;
                goLinearLayout2.removeViews(size, arrayList6.size() - size);
                arrayList7 = transferRequirementModalView.ruleViewsCache;
                arrayList8 = transferRequirementModalView.ruleViewsCache;
                arrayList7.subList(size, arrayList8.size()).clear();
            } else {
                arrayList2 = transferRequirementModalView.ruleViewsCache;
                if (arrayList2.size() < size) {
                    arrayList3 = transferRequirementModalView.ruleViewsCache;
                    int size2 = size - arrayList3.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ListItemComponent listItemComponent4 = new ListItemComponent(transferRequirementModalView.getContext(), null, 0, 6, null);
                        listItemComponent4.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        listItemComponent4.setBackgroundColor((kdc) null);
                        arrayList4 = transferRequirementModalView.ruleViewsCache;
                        arrayList4.add(listItemComponent4);
                        binding13 = transferRequirementModalView.getBinding();
                        binding13.m.addView(listItemComponent4);
                    }
                }
            }
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    scc.m();
                    throw null;
                }
                hkl0 hkl0Var = (hkl0) obj;
                arrayList5 = transferRequirementModalView.ruleViewsCache;
                ListItemComponent listItemComponent5 = (ListItemComponent) arrayList5.get(i3);
                listItemComponent5.setTitle(hkl0Var.b);
                listItemComponent5.setLeadImage(hkl0Var.a);
                i3 = i4;
            }
        }
        final o4m o4mVar = qp01Var.f;
        binding15 = transferRequirementModalView.getBinding();
        if (o4mVar == null) {
            binding15.c.setVisibility(8);
            binding15.d.setVisibility(8);
            h(null);
            return;
        }
        String str3 = o4mVar.c;
        ButtonComponent buttonComponent = binding15.c;
        RobotoTextView robotoTextView = binding15.d;
        buttonComponent.setVisibility(0);
        buttonComponent.setText(o4mVar.a);
        if (o4mVar.b) {
            buttonComponent.startProgress();
        } else {
            buttonComponent.finishProgress();
        }
        if (str3 != null && str3.length() != 0) {
            i = 0;
        }
        robotoTextView.setVisibility(i);
        robotoTextView.setText(str3);
        h(o4mVar.d);
        buttonComponent.setDebounceClickListener(new Runnable() { // from class: com.yandex.go.transfer_requirement.mvp.a
            @Override // java.lang.Runnable
            public final void run() {
                op01 op01Var;
                op01Var = TransferRequirementModalView.this.presenter;
                tje.N(op01Var.Jg(), null, null, new TransferRequirementModalViewPresenter$onDoneButtonClicked$1(o4mVar.e, op01Var, null), 3);
            }
        });
    }
}
