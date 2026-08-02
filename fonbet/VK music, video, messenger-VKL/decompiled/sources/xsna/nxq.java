package xsna;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.vk.audience.api.domain.AudienceResearchSurfaceCode;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.music.MusicTrack;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class nxq implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ nxq(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        switch (this.b) {
            case 0:
                List list = (List) this.c;
                oxq oxqVar = (oxq) this.d;
                AudienceResearchSurfaceCode audienceResearchSurfaceCode = (AudienceResearchSurfaceCode) this.e;
                List list2 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(oxqVar.f.Z2().a((String) it.next()).b(audienceResearchSurfaceCode).build());
                }
                return arrayList;
            default:
                he50 he50Var = (he50) this.c;
                ClipVideoFile clipVideoFile = (ClipVideoFile) this.d;
                Context context = (Context) this.e;
                bpn0 bpn0Var = he50Var.f;
                CharSequence c = ((ibr0) bpn0Var.getValue()).c(clipVideoFile.D1);
                StringBuilder sb = new StringBuilder();
                ibr0 ibr0Var = (ibr0) bpn0Var.getValue();
                MusicTrack musicTrack = clipVideoFile.D1;
                sb.append((Object) ibr0Var.b(musicTrack != null ? musicTrack.d : null));
                sb.append(' ');
                if (musicTrack == null || (str = musicTrack.e) == null) {
                    str = "";
                }
                sb.append(str);
                String obj = drm0.p0(sb.toString()).toString();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if ((musicTrack != null ? musicTrack.d : null) != null) {
                    ylw ylwVar = new ylw(R.drawable.vk_icon_music_16);
                    ylwVar.d(R.color.vk_white);
                    ylwVar.f = cn70.b(2);
                    spannableStringBuilder.append((CharSequence) ylwVar.b(context));
                    spannableStringBuilder.append((CharSequence) rik0.b(4.0f));
                    spannableStringBuilder.append((CharSequence) (((Object) c) + " — " + obj));
                }
                return spannableStringBuilder;
        }
    }
}
