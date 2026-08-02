package com.yandex.passport.internal.ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.yandex.passport.api.exception.PassportRuntimeUnknownException;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.properties.ProgressPropertiesImpl;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.eja1;
import defpackage.i3y;
import defpackage.rs11;
import defpackage.tje;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b!\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0015¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u0004\u0018\u00018\u0000*\u00020\u000fH$¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u000f*\u00028\u0001H$¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00028\u00012\u0006\u0010\u0017\u001a\u00028\u0000H¤@¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R#\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00020#0\"8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/yandex/passport/internal/ui/ResultAwareActivity;", CA20Status.STATUS_USER_I, "O", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Ljava/lang/Exception;", "Lkotlin/Exception;", Constants.KEY_EXCEPTION, "Lzy11;", "finishWithException", "(Ljava/lang/Exception;)V", TarifficatorScenarioActivity.RESULT_KEY, "finishWithResult", "(Ljava/lang/Object;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "parse", "(Landroid/os/Bundle;)Ljava/lang/Object;", "toBundle", "(Ljava/lang/Object;)Landroid/os/Bundle;", "input", "logic", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "resultCodeFor", "(Ljava/lang/Object;)I", "Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;", "applicationComponent", "Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;", "getApplicationComponent", "()Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;", "Lrs11;", "Landroid/view/View;", "ui$delegate", "Li3y;", "getUi", "()Lrs11;", "ui", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ResultAwareActivity<I, O> extends AppCompatActivity {
    public static final int $stable = 8;
    private final PassportProcessGlobalComponent applicationComponent = com.yandex.passport.internal.di.a.a();

    /* renamed from: ui$delegate, reason: from kotlin metadata */
    private final i3y ui = kotlin.a.a(new com.yandex.passport.internal.flags.experiments.h(5, this));

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithException(Exception exception) {
        Intent intent = new Intent();
        intent.putExtra(Constants.KEY_EXCEPTION, exception);
        setResult(13, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithResult(O result) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "activity finishWithResult " + result, 8);
        }
        int resultCodeFor = resultCodeFor(result);
        Intent intent = new Intent();
        Bundle bundle = toBundle(result);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        setResult(resultCodeFor, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.yandex.passport.internal.ui.common.c ui_delegate$lambda$0(ResultAwareActivity resultAwareActivity) {
        com.yandex.passport.internal.properties.p properties = resultAwareActivity.applicationComponent.getProperties();
        ProgressPropertiesImpl.Companion.getClass();
        return new com.yandex.passport.internal.ui.common.c(resultAwareActivity, com.yandex.passport.internal.properties.m.a(), properties);
    }

    public final PassportProcessGlobalComponent getApplicationComponent() {
        return this.applicationComponent;
    }

    public rs11 getUi() {
        return (rs11) this.ui.getValue();
    }

    public abstract Object logic(I i, Continuation<? super O> continuation);

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        Bundle extras;
        I parse;
        super.onCreate(savedInstanceState);
        setContentView(getUi().getRoot());
        Intent intent = getIntent();
        if (intent == null || (extras = intent.getExtras()) == null || (parse = parse(extras)) == null) {
            finishWithException(new PassportRuntimeUnknownException("no input data"));
        } else {
            tje.N(eja1.s(this), null, null, new ResultAwareActivity$onCreate$1(this, parse, null), 3);
        }
    }

    public abstract I parse(Bundle bundle);

    public int resultCodeFor(O result) {
        return -1;
    }

    public abstract Bundle toBundle(O o);
}
