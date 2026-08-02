package xsna;

import com.vk.ads.easypromote.impl.domain.model.DurationOption;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import xsna.rwo;
import xsna.zvo;

/* compiled from: EasyPromoteReducer.kt */
/* loaded from: classes14.dex */
public final class ewo extends dm50<uwo, zvo, rwo> {
    @Override // xsna.dm50
    public final rwo c(rwo rwoVar, zvo zvoVar) {
        rwo rwoVar2 = rwoVar;
        zvo zvoVar2 = zvoVar;
        if (zvoVar2 instanceof zvo.c) {
            zvo.c cVar = (zvo.c) zvoVar2;
            float f = cVar.b;
            return new rwo.a(new ul8(f, cVar.c, cVar.d, wvo.a()[(int) (10.0f * f)].intValue()), new ioo(cVar.e, cVar.f), cVar.g);
        }
        if (zvoVar2 instanceof zvo.a) {
            float f2 = ((zvo.a) zvoVar2).b;
            if (!(rwoVar2 instanceof rwo.a)) {
                throw new NoWhenBranchMatchedException();
            }
            int intValue = wvo.a()[(int) (10.0f * f2)].intValue();
            rwo.a aVar = (rwo.a) rwoVar2;
            ul8 ul8Var = aVar.b;
            return rwo.a.a(aVar, new ul8(f2, ul8Var.b, ul8Var.c, intValue), null, false, 62);
        }
        if (!(zvoVar2 instanceof zvo.b)) {
            if (!(zvoVar2 instanceof zvo.d)) {
                throw new NoWhenBranchMatchedException();
            }
            if (rwoVar2 instanceof rwo.a) {
                return rwo.a.a((rwo.a) rwoVar2, null, null, false, 15);
            }
            throw new NoWhenBranchMatchedException();
        }
        DurationOption durationOption = ((zvo.b) zvoVar2).b;
        if (!(rwoVar2 instanceof rwo.a)) {
            throw new NoWhenBranchMatchedException();
        }
        boolean z = durationOption != DurationOption.CUSTOM;
        rwo.a aVar2 = (rwo.a) rwoVar2;
        ioo iooVar = aVar2.c;
        int i = durationOption.i();
        Date date = new Date(System.currentTimeMillis());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(6, i);
        String format = new SimpleDateFormat("dd MMMM, EE", Locale.getDefault()).format(calendar.getTime());
        iooVar.getClass();
        return rwo.a.a(aVar2, null, new ioo(durationOption, format), z, 57);
    }

    @Override // xsna.dm50
    public final uwo d() {
        return new uwo(e(new pl2(26)));
    }

    @Override // xsna.dm50
    public final void h(rwo rwoVar, uwo uwoVar) {
        rwo rwoVar2 = rwoVar;
        uwo uwoVar2 = uwoVar;
        if (!(rwoVar2 instanceof rwo.a)) {
            throw new NoWhenBranchMatchedException();
        }
        f(uwoVar2.a, rwoVar2);
    }
}
