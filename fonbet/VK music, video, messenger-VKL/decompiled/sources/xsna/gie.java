package xsna;

import com.vk.api.generated.recomSettings.dto.RecomSettingsGetAvailableRecomThemesResponseDto;
import com.vk.api.generated.recomSettings.dto.RecomSettingsRecomThemeDto;
import com.vk.api.generated.recomSettings.dto.RecomSettingsSubRecomThemeDto;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.fld;
import xsna.jge;

/* compiled from: ClipsInterestsUserRecomRemoteStorageImpl.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class gie extends FunctionReferenceImpl implements izs<RecomSettingsGetAvailableRecomThemesResponseDto, List<? extends jge.a>> {
    @Override // xsna.izs
    public final List<? extends jge.a> invoke(RecomSettingsGetAvailableRecomThemesResponseDto recomSettingsGetAvailableRecomThemesResponseDto) {
        ((amf) this.receiver).getClass();
        List<RecomSettingsRecomThemeDto> d = recomSettingsGetAvailableRecomThemesResponseDto.d();
        ArrayList arrayList = new ArrayList(c5g.u(d, 10));
        for (RecomSettingsRecomThemeDto recomSettingsRecomThemeDto : d) {
            fld.b bVar = new fld.b(recomSettingsRecomThemeDto.getId());
            String e = recomSettingsRecomThemeDto.e();
            String d2 = recomSettingsRecomThemeDto.d();
            List<RecomSettingsSubRecomThemeDto> f = recomSettingsRecomThemeDto.f();
            ArrayList arrayList2 = new ArrayList(c5g.u(f, 10));
            for (RecomSettingsSubRecomThemeDto recomSettingsSubRecomThemeDto : f) {
                arrayList2.add(new jge.b(new fld.a(recomSettingsSubRecomThemeDto.e()), recomSettingsSubRecomThemeDto.f(), recomSettingsSubRecomThemeDto.d()));
            }
            arrayList.add(new jge.a(bVar, e, d2, arrayList2));
        }
        return arrayList;
    }
}
