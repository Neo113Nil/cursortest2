package com.yandex.go.payments.shared.members.list;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.payments.shared.members.list.d;
import defpackage.bi10;
import defpackage.ce0;
import defpackage.e32;
import defpackage.fbz;
import defpackage.mys;
import defpackage.qje;
import defpackage.th10;
import defpackage.xng0;
import defpackage.yes0;
import defpackage.yh10;
import defpackage.zh10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListGroupHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;

/* loaded from: classes13.dex */
public final class c implements zh10 {
    public final /* synthetic */ MembersListView a;

    public c(MembersListView membersListView) {
        this.a = membersListView;
    }

    @Override // defpackage.zh10
    public final void B2(d dVar) {
        ListItemComponent listItemComponent;
        ListItemComponent listItemComponent2;
        ListItemInputComponent listItemInputComponent;
        ArrayList<String> arrayList;
        ArrayList arrayList2;
        ListItemInputComponent listItemInputComponent2;
        ListGroupHeaderComponent listGroupHeaderComponent;
        ListItemInputComponent listItemInputComponent3;
        ListItemInputComponent listItemInputComponent4;
        ListItemInputComponent listItemInputComponent5;
        View view;
        ButtonComponent buttonComponent;
        ButtonComponent buttonComponent2;
        ButtonComponent buttonComponent3;
        View view2;
        ButtonComponent buttonComponent4;
        ButtonComponent buttonComponent5;
        yh10 yh10Var;
        ArrayList<String> arrayList3;
        View view3;
        e32 e32Var;
        ArrayList arrayList4;
        View view4;
        ButtonComponent buttonComponent6;
        b bVar;
        ArrayList arrayList5;
        e32 e32Var2;
        MembersListView membersListView = this.a;
        listItemComponent = membersListView.noMembersViewTitle;
        String str = dVar.m;
        List list = dVar.i;
        boolean z = dVar.f;
        listItemComponent.setTitle(str);
        listItemComponent2 = membersListView.noMembersViewSubtitle;
        listItemComponent2.setTitle(dVar.n);
        if (dVar == d.o) {
            yes0 yes0Var = SimpleSpinnerModalView.Companion;
            ViewGroup viewGroup = (ViewGroup) membersListView.getRootView();
            yes0Var.getClass();
            yes0.d(viewGroup, null);
            return;
        }
        yes0 yes0Var2 = SimpleSpinnerModalView.Companion;
        ViewGroup viewGroup2 = (ViewGroup) membersListView.getRootView();
        yes0Var2.getClass();
        yes0.b(viewGroup2);
        listItemInputComponent = membersListView.commonLimit;
        if (!listItemInputComponent.hasFocus()) {
            membersListView.requestFocus();
        }
        membersListView.getToolbar().setTitle(dVar.c);
        if (dVar.a) {
            membersListView.getToolbar().enableNavigationButton();
            membersListView.getToolbar().setOnNavigationClickListener(new fbz(21, membersListView));
        } else {
            membersListView.getToolbar().disableNavigationButton();
        }
        arrayList = membersListView.additionalButtonsList;
        for (String str2 : arrayList) {
            e32Var2 = membersListView.analyticsContext;
            e32Var2.c.remove(str2);
        }
        arrayList2 = membersListView.additionalButtonsList;
        arrayList2.clear();
        if (dVar.b) {
            String str3 = dVar.e;
            membersListView.getToolbar().setTrailCompanionText(dVar.d);
            membersListView.getToolbar().setTrailStrongTextColor(qje.t(xng0.textMain, membersListView.getContext()));
            ToolbarComponent toolbar = membersListView.getToolbar();
            bVar = membersListView.presenter;
            toolbar.setTrailContainerClickListener(new bi10(bVar, 7), str3);
            arrayList5 = membersListView.additionalButtonsList;
            arrayList5.add(str3);
        } else {
            membersListView.getToolbar().clearTrailText();
        }
        listItemInputComponent2 = membersListView.commonLimit;
        listItemInputComponent2.setVisibility(z ? 0 : 8);
        listGroupHeaderComponent = membersListView.commonLimitDivider;
        listGroupHeaderComponent.setVisibility(z ? 0 : 8);
        listItemInputComponent3 = membersListView.commonLimit;
        listItemInputComponent3.setTextWithoutNotifying(dVar.g);
        listItemInputComponent4 = membersListView.commonLimit;
        listItemInputComponent4.setAlertText(dVar.j);
        listItemInputComponent5 = membersListView.commonLimit;
        listItemInputComponent5.setTitle(dVar.h);
        d.a aVar = dVar.l;
        String str4 = aVar.c;
        boolean z2 = aVar.d;
        if (str4 == null || str4.length() == 0) {
            view = membersListView.bottomButtonContainer;
            view.setVisibility(8);
        } else {
            view4 = membersListView.bottomButtonContainer;
            view4.setVisibility(0);
            buttonComponent6 = membersListView.bottomButton;
            buttonComponent6.setText(aVar.c);
        }
        buttonComponent = membersListView.bottomButton;
        buttonComponent.setButtonBackground(aVar.a);
        buttonComponent2 = membersListView.bottomButton;
        buttonComponent2.setButtonTitleColor(aVar.b);
        buttonComponent3 = membersListView.bottomButton;
        buttonComponent3.setProgressing(z2);
        view2 = membersListView.controlsBlocker;
        view2.setVisibility(z2 ? 0 : 8);
        buttonComponent4 = membersListView.bottomButton;
        buttonComponent4.setDebounceClickListener(aVar.e);
        buttonComponent5 = membersListView.bottomButton;
        buttonComponent5.setAnalyticsButtonName(aVar.f);
        yh10Var = membersListView.membersListAdapter;
        yh10Var.a = list;
        yh10Var.notifyDataSetChanged();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str5 = ((th10) it.next()).i;
            if (str5 != null && str5.length() != 0) {
                arrayList4 = membersListView.additionalButtonsList;
                arrayList4.add(str5);
            }
        }
        arrayList3 = membersListView.additionalButtonsList;
        for (String str6 : arrayList3) {
            e32Var = membersListView.analyticsContext;
            e32Var.c.add(str6);
        }
        view3 = membersListView.noMembersView;
        view3.setVisibility(dVar.k ? 0 : 8);
        membersListView.updateShadowVisibility();
    }

    @Override // defpackage.zh10
    public final void S4(mys mysVar) {
        this.a.setCloseTransitionReason(mysVar);
    }

    @Override // defpackage.zh10
    public final void closeKeyboard() {
        ListItemInputComponent listItemInputComponent;
        listItemInputComponent = this.a.commonLimit;
        if (listItemInputComponent == null) {
            return;
        }
        listItemInputComponent.post(new ce0(listItemInputComponent, 15));
    }
}
