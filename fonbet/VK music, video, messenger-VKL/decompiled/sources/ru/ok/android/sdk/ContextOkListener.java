package ru.ok.android.sdk;

import android.content.Context;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import xsna.s3q0;
import xsna.wzs;
import xsna.zcl;

/* compiled from: ContextOkListener.kt */
/* loaded from: classes9.dex */
public final class ContextOkListener implements OkAuthListener {
    private final WeakReference<Context> contextRef;
    private final wzs<Context, String, s3q0> onCancel;
    private final wzs<Context, String, s3q0> onError;
    private final wzs<Context, JSONObject, s3q0> onSuccess;

    /* JADX WARN: Multi-variable type inference failed */
    public ContextOkListener(Context context, wzs<? super Context, ? super JSONObject, s3q0> wzsVar, wzs<? super Context, ? super String, s3q0> wzsVar2, wzs<? super Context, ? super String, s3q0> wzsVar3) {
        this.onSuccess = wzsVar;
        this.onCancel = wzsVar2;
        this.onError = wzsVar3;
        this.contextRef = new WeakReference<>(context);
    }

    @Override // ru.ok.android.sdk.OkAuthListener
    public void onCancel(String str) {
        wzs<Context, String, s3q0> wzsVar;
        Context context = this.contextRef.get();
        if (context == null || (wzsVar = this.onCancel) == null) {
            return;
        }
        wzsVar.invoke(context, str);
    }

    @Override // ru.ok.android.sdk.OkListener
    public void onError(String str) {
        wzs<Context, String, s3q0> wzsVar;
        Context context = this.contextRef.get();
        if (context == null || (wzsVar = this.onError) == null) {
            return;
        }
        wzsVar.invoke(context, str);
    }

    @Override // ru.ok.android.sdk.OkListener
    public void onSuccess(JSONObject jSONObject) {
        wzs<Context, JSONObject, s3q0> wzsVar;
        Context context = this.contextRef.get();
        if (context == null || (wzsVar = this.onSuccess) == null) {
            return;
        }
        wzsVar.invoke(context, jSONObject);
    }

    public /* synthetic */ ContextOkListener(Context context, wzs wzsVar, wzs wzsVar2, wzs wzsVar3, int i, zcl zclVar) {
        this(context, (i & 2) != 0 ? null : wzsVar, (i & 4) != 0 ? null : wzsVar2, (i & 8) != 0 ? null : wzsVar3);
    }
}
