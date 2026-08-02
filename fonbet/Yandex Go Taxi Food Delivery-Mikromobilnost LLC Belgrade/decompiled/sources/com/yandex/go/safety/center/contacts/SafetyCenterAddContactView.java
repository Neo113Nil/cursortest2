package com.yandex.go.safety.center.contacts;

import android.content.Context;
import android.widget.FrameLayout;
import com.yandex.go.safety.center.base.BaseSafetyCenterView;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import defpackage.bgq0;
import defpackage.gbq0;
import defpackage.hbq0;
import defpackage.hxj0;
import defpackage.ibq0;
import defpackage.kpl0;
import defpackage.mpl0;
import defpackage.q5z;
import defpackage.rv70;
import defpackage.tjh0;
import defpackage.uq1;
import defpackage.zde;
import defpackage.zuj0;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.contacts.SelectContactView;
import ru.yandex.taxi.contacts.c;
import ru.yandex.taxi.contacts.d;
import ru.yandex.taxi.contacts.g;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B=\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/yandex/go/safety/center/contacts/SafetyCenterAddContactView;", "Lcom/yandex/go/safety/center/base/BaseSafetyCenterView;", "Lkpl0;", "Landroid/content/Context;", "context", "Lmpl0;", "presenter", "Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment;", "experiment", "Libq0;", "selectContactViewDependencies", "Lrv70;", "orderForAnotherContactsRepository", "Lhbq0;", "selectContactViewConfigFactory", "<init>", "(Landroid/content/Context;Lmpl0;Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment;Libq0;Lrv70;Lhbq0;)V", "Lzy11;", "onTouchOutside", "()V", "Lmpl0;", "Lru/yandex/taxi/contacts/SelectContactView;", "selectContactView", "Lru/yandex/taxi/contacts/SelectContactView;", "", "getCardContentViewLayoutRes", "()I", "cardContentViewLayoutRes", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SafetyCenterAddContactView extends BaseSafetyCenterView implements kpl0 {
    private final mpl0 presenter;
    private final SelectContactView selectContactView;

    public SafetyCenterAddContactView(Context context, mpl0 mpl0Var, SafetyCenterExperiment safetyCenterExperiment, ibq0 ibq0Var, rv70 rv70Var, hbq0 hbq0Var) {
        super(context, mpl0Var);
        this.presenter = mpl0Var;
        String a = safetyCenterExperiment.a(SafetyCenterExperiment.L10nKey.TRUSTED_CONTACTS_ADD_LINK_TITLE);
        bgq0 bgq0Var = bgq0.f;
        String a2 = safetyCenterExperiment.a(SafetyCenterExperiment.L10nKey.TRUSTED_CONTACTS_PERMISSION_REQUEST);
        hbq0Var.getClass();
        gbq0 gbq0Var = new gbq0(a, null, null, EmptyList.a, null, bgq0Var, a2, true, false, false, false, true, true, false, false);
        ibq0Var.getClass();
        context.getClass();
        rv70Var.getClass();
        mpl0Var.getClass();
        ru.yandex.taxi.contacts.a aVar = ibq0Var.a;
        q5z.h(aVar);
        zuj0 zuj0Var = ibq0Var.b;
        q5z.h(zuj0Var);
        zde zdeVar = new zde();
        g gVar = ibq0Var.c;
        q5z.h(gVar);
        d dVar = new d(aVar, gbq0Var, rv70Var, zuj0Var, zdeVar, gVar, mpl0Var);
        c cVar = new c(context);
        uq1 uq1Var = ibq0Var.d;
        q5z.h(uq1Var);
        SelectContactView selectContactView = new SelectContactView(context, dVar, cVar, uq1Var);
        this.selectContactView = selectContactView;
        selectContactView.setTitleNavigation();
        ((FrameLayout) getCardContentView()).addView(selectContactView);
        selectContactView.setKeyboardCloseListener(new hxj0(14, this));
        setDismissOnTouchOutside(true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return tjh0.safety_center_add_contact_view;
    }

    @Override // com.yandex.go.safety.center.base.BaseSafetyCenterView, ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
        this.selectContactView.dismiss();
        super.onTouchOutside();
    }
}
