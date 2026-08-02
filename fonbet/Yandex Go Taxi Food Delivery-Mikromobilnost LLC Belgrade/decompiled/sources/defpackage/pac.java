package defpackage;

import android.util.Base64;
import com.yandex.xplat.common.YSError;

/* loaded from: classes5.dex */
public final class pac implements fev, ryj0, amm0 {
    public final /* synthetic */ tls a;
    public final /* synthetic */ tls b;

    public /* synthetic */ pac(tls tlsVar, tls tlsVar2) {
        this.a = tlsVar;
        this.b = tlsVar2;
    }

    @Override // defpackage.amm0
    public void a(hf3 hf3Var) {
        this.b.invoke(hf3Var);
    }

    @Override // defpackage.amm0
    public void b(hf3 hf3Var) {
        this.a.invoke(hf3Var);
    }

    @Override // defpackage.ryj0
    public void i(Object obj) {
        this.b.invoke((YSError) obj);
    }

    @Override // defpackage.fev
    public void onCancel(hev hevVar) {
    }

    @Override // defpackage.fev
    public void onError(hev hevVar, n9o n9oVar) {
        this.a.invoke(Boolean.valueOf(n9oVar.a == null));
    }

    @Override // defpackage.fev
    public void onStart(hev hevVar) {
    }

    @Override // defpackage.ryj0
    public void onSuccess(Object obj) {
        this.a.invoke(Base64.encodeToString(((String) obj).getBytes(uza.a), 2));
    }

    @Override // defpackage.fev
    public void onSuccess(hev hevVar, u3v0 u3v0Var) {
        this.b.invoke(Boolean.FALSE);
    }
}
