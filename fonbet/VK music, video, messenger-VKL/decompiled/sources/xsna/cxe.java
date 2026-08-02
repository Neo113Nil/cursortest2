package xsna;

import android.content.Context;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.dto.shortvideo.ClipsAuthor;
import com.vk.log.L;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class cxe implements izs {
    public final /* synthetic */ izs b;
    public final /* synthetic */ String c;
    public final /* synthetic */ fxe d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ ClipsAuthor g;

    public /* synthetic */ cxe(Context context, Context context2, ClipsAuthor clipsAuthor, String str, fxe fxeVar, izs izsVar) {
        this.b = izsVar;
        this.c = str;
        this.d = fxeVar;
        this.e = context;
        this.f = context2;
        this.g = clipsAuthor;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        BaseOkResponseDto baseOkResponseDto = (BaseOkResponseDto) obj;
        BaseOkResponseDto baseOkResponseDto2 = BaseOkResponseDto.OK;
        izs izsVar = this.b;
        String str = this.c;
        if (baseOkResponseDto == baseOkResponseDto2) {
            izsVar.invoke(str);
        } else {
            L.l("Can't save group bio");
            this.d.d(this.e, this.f, this.g, str, izsVar);
        }
        return s3q0.a;
    }
}
