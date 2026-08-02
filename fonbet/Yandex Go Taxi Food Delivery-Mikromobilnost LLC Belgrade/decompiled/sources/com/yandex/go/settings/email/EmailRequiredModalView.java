package com.yandex.go.settings.email;

import android.content.Context;
import android.view.View;
import defpackage.bxl;
import defpackage.d6z;
import defpackage.dkh0;
import defpackage.f28;
import defpackage.gsn;
import defpackage.jln;
import defpackage.lg21;
import defpackage.m950;
import defpackage.mg21;
import defpackage.rp31;
import defpackage.srn;
import defpackage.t7h0;
import defpackage.uhm;
import defpackage.wqj;
import defpackage.yvf0;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/yandex/go/settings/email/EmailRequiredModalView;", "Lru/yandex/taxi/widget/SlideableModalView;", "Landroid/content/Context;", "context", "Lcom/yandex/go/settings/email/EmailRequireExperiment;", "experiment", "Lgsn;", "eventListener", "<init>", "(Landroid/content/Context;Lcom/yandex/go/settings/email/EmailRequireExperiment;Lgsn;)V", "", "getCardContentViewLayoutRes", "()I", "cardContentViewLayoutRes", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EmailRequiredModalView extends SlideableModalView {
    public static final int $stable = 8;

    public EmailRequiredModalView(Context context, EmailRequireExperiment emailRequireExperiment, gsn gsnVar) {
        super(context);
        int i = t7h0.add_email;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ButtonComponent buttonComponent = (ButtonComponent) ((View) rp31.d(this, i));
        buttonComponent.setOnClickListener(new uhm(18, gsnVar));
        buttonComponent.setText(d6z.Y(emailRequireExperiment, emailRequireExperiment.g));
        ((ListTitleComponent) ((View) rp31.d(this, t7h0.dialog_title))).setTitle(d6z.Y(emailRequireExperiment, emailRequireExperiment.e));
        ((ListTextComponent) ((View) rp31.d(this, t7h0.dialog_description))).setText(d6z.Y(emailRequireExperiment, emailRequireExperiment.f));
        ListItemComponent listItemComponent = (ListItemComponent) ((View) rp31.d(this, t7h0.about));
        listItemComponent.setVisibility(emailRequireExperiment.d.length() == 0 ? 8 : 0);
        listItemComponent.setTitle(d6z.Y(emailRequireExperiment, emailRequireExperiment.h));
        listItemComponent.setDebounceClickListener(new wqj(19, gsnVar, emailRequireExperiment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(gsn gsnVar) {
        f28 f28Var = (f28) ((jln) gsnVar).b;
        f28Var.z((m950) ((yvf0) f28Var.F).get(), new srn(new bxl(28, f28Var), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(gsn gsnVar, EmailRequireExperiment emailRequireExperiment) {
        ((mg21) ((lg21) ((f28) ((jln) gsnVar).b).I)).c(emailRequireExperiment.d);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return dkh0.email_required_content;
    }
}
