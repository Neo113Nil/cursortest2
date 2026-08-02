package xsna;

import com.ironsource.X3;
import com.vk.api.generated.vkRun.dto.VkRunImportSourceDto;
import com.vk.api.generated.vkRun.dto.VkRunSetStepsSourceDto;
import com.vk.api.generated.vkRun.dto.VkRunStepsListItemDetailsDto;
import com.vk.api.generated.vkRun.dto.VkRunStepsListItemDto;
import com.vk.superapp.api.generated.GsonHolder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: GeneratedSuperappApi.kt */
/* loaded from: classes6.dex */
public final class fjt implements zfn0 {
    public final bpn0 a = new bpn0(new z34(12));

    @Override // xsna.zfn0
    public final io.reactivex.rxjava3.internal.operators.single.y a(int i, float f, int i2, float f2, String str, ArrayList arrayList) {
        VkRunSetStepsSourceDto vkRunSetStepsSourceDto;
        String format = new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(new Date(System.currentTimeMillis()));
        SimpleDateFormat simpleDateFormat = ehv0.a;
        int i3 = (int) (f * 1000.0f);
        Integer valueOf = Integer.valueOf(i2);
        Integer valueOf2 = Integer.valueOf((int) (f2 * 1000.0f));
        VkRunSetStepsSourceDto[] values = VkRunSetStepsSourceDto.values();
        int length = values.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                vkRunSetStepsSourceDto = null;
                break;
            }
            vkRunSetStepsSourceDto = values[i4];
            if (epx.f(vkRunSetStepsSourceDto.i(), str)) {
                break;
            }
            i4++;
        }
        if (vkRunSetStepsSourceDto == null) {
            vkRunSetStepsSourceDto = VkRunSetStepsSourceDto.BACKGROUND_SYNC;
        }
        ufx ufxVar = new ufx("vkRun.setSteps", new wga0(9), new uul0(4));
        ufxVar.g(10, 10, "date", format);
        ufxVar.f(i, 0, X3.b.c, "steps");
        ufxVar.f(i3, 0, 100000, "distance");
        ufxVar.f(valueOf.intValue(), 0, X3.b.c, "manual_steps");
        ufxVar.f(valueOf2.intValue(), 0, 100000, "manual_distance");
        if (vkRunSetStepsSourceDto != null) {
            ufx.n(ufxVar, "source", vkRunSetStepsSourceDto.i(), 0, 12);
        }
        ufx.n(ufxVar, "details", GsonHolder.a().toJson(arrayList), 0, 12);
        return rdx0.B(e370.e(ufxVar)).l(new o40(new dh5(29), 21));
    }

    @Override // xsna.zfn0
    public final io.reactivex.rxjava3.internal.operators.single.y b(String str, List list) {
        VkRunImportSourceDto vkRunImportSourceDto;
        ((ehv0) this.a.getValue()).getClass();
        List list2 = list;
        int i = 10;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (true) {
            vkRunImportSourceDto = null;
            ArrayList arrayList2 = null;
            if (!it.hasNext()) {
                break;
            }
            m0l0 m0l0Var = (m0l0) it.next();
            String format = ehv0.a.format(new Date(m0l0Var.c));
            int i2 = m0l0Var.a;
            int i3 = (int) (m0l0Var.b * 1000.0f);
            Integer valueOf = Integer.valueOf(m0l0Var.d);
            Integer valueOf2 = Integer.valueOf((int) (m0l0Var.e * 1000.0f));
            List<s0l0> list3 = m0l0Var.g;
            if (list3 != null) {
                List<s0l0> list4 = list3;
                arrayList2 = new ArrayList(c5g.u(list4, i));
                for (s0l0 s0l0Var : list4) {
                    arrayList2.add(new VkRunStepsListItemDetailsDto(Integer.valueOf(s0l0Var.a), Integer.valueOf((int) (s0l0Var.b * 1000.0f)), Boolean.valueOf(s0l0Var.d), s0l0Var.c));
                }
            }
            arrayList.add(new VkRunStepsListItemDto(format, i2, i3, valueOf, valueOf2, arrayList2));
            i = 10;
        }
        VkRunImportSourceDto[] values = VkRunImportSourceDto.values();
        int length = values.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            VkRunImportSourceDto vkRunImportSourceDto2 = values[i4];
            if (epx.f(vkRunImportSourceDto2.i(), str)) {
                vkRunImportSourceDto = vkRunImportSourceDto2;
                break;
            }
            i4++;
        }
        if (vkRunImportSourceDto == null) {
            vkRunImportSourceDto = VkRunImportSourceDto.BACKGROUND_SYNC;
        }
        ufx ufxVar = new ufx("vkRun.import", new fhv0(), new ggj0(8));
        ufx.n(ufxVar, "steps_list", GsonHolder.a().toJson(arrayList), 0, 12);
        if (vkRunImportSourceDto != null) {
            ufx.n(ufxVar, "source", vkRunImportSourceDto.i(), 0, 12);
        }
        return rdx0.B(e370.e(ufxVar)).l(new m40(new z8f(this, 16), 16));
    }
}
