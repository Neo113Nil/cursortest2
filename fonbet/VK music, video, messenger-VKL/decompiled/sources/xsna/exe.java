package xsna;

import android.content.Context;
import com.vk.api.generated.account.dto.AccountSaveProfileInfoResponseDto;
import com.vk.log.L;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class exe implements izs {
    public final /* synthetic */ izs b;
    public final /* synthetic */ String c;
    public final /* synthetic */ fxe d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ Context f;

    public /* synthetic */ exe(Context context, Context context2, String str, fxe fxeVar, izs izsVar) {
        this.b = izsVar;
        this.c = str;
        this.d = fxeVar;
        this.e = context;
        this.f = context2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = ((AccountSaveProfileInfoResponseDto) obj).d().i();
        izs izsVar = this.b;
        String str = this.c;
        if (i == 1) {
            izsVar.invoke(str);
        } else {
            L.l("Can't save account about");
            this.d.d(this.e, this.f, null, str, izsVar);
        }
        return s3q0.a;
    }
}
