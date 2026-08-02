package xsna;

import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteStatementType;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: InitDelegate.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.presentation.publish.feature.store.delegate.InitDelegateKt", f = "InitDelegate.kt", l = {97, SQLiteStatementType.STATEMENT_OTHER, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 135, 143}, m = "initUploadMode")
/* loaded from: classes7.dex */
public final class cyw extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;

    public cyw() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return rxw.d(null, null, this);
    }
}
