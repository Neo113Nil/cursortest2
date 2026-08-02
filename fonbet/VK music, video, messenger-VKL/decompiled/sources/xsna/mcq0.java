package xsna;

import com.vk.clips.upload.ui.api.entities.SharingPlatform;
import com.vk.clips.upload.ui.api.entities.cell.ClipUploadItem;
import com.vk.dto.clips.media.ClipsEncoderParameters;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.fna;
import xsna.gna;
import xsna.rkp;
import xsna.skp;
import xsna.tlo0;
import xsna.zoa;

/* compiled from: UploadScreenMapper.kt */
/* loaded from: classes17.dex */
public final class mcq0 {

    /* compiled from: UploadScreenMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ClipUploadItem.Cell.Default.PostToWall.Mode.values().length];
            try {
                iArr[ClipUploadItem.Cell.Default.PostToWall.Mode.WALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipUploadItem.Cell.Default.PostToWall.Mode.MAIN_TAB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SharingPlatform.values().length];
            try {
                iArr2[SharingPlatform.VK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00cd A[LOOP:0: B:16:0x00c7->B:18:0x00cd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static pgf a(ClipUploadItem clipUploadItem, ClipsEncoderParameters clipsEncoderParameters) {
        gna gnaVar;
        skp bVar;
        skp skpVar;
        skp skpVar2;
        String b;
        if (!(clipUploadItem instanceof ClipUploadItem.Cell)) {
            if (clipUploadItem instanceof ClipUploadItem.b) {
                ClipUploadItem.b bVar2 = (ClipUploadItem.b) clipUploadItem;
                return new zdd(new zoa.a(bVar2.a), new jai(1059848525, new ryq(bVar2, 2), true));
            }
            sdy.w();
            throw null;
        }
        ClipUploadItem.Cell cell = (ClipUploadItem.Cell) clipUploadItem;
        if (!(cell instanceof ClipUploadItem.Cell.a)) {
            if (cell instanceof ClipUploadItem.Cell.Default.c) {
                ClipUploadItem.Cell.Default.c cVar = (ClipUploadItem.Cell.Default.c) cell;
                if (clipsEncoderParameters.b.b.size() >= 3) {
                    return new hze(cpa.a, tq.h(tlo0.Companion, R.string.clips_publish_allow_templates_title), new tlo0.f(R.string.clips_publish_allow_templates_subtitle), new skp.f(cVar.a), true, new cna(exi.a, new tlo0.f(R.string.clips_publish_allow_templates_details)), null, 832);
                }
                return null;
            }
            if (!(cell instanceof ClipUploadItem.Cell.Default)) {
                throw new NoWhenBranchMatchedException();
            }
            ClipUploadItem.Cell.Default r11 = (ClipUploadItem.Cell.Default) cell;
            if (r11 instanceof ClipUploadItem.Cell.Default.d) {
                return new hze(dpa.a, tq.h(tlo0.Companion, R.string.clips_ord_title), new tlo0.f(((ClipUploadItem.Cell.Default.d) r11).a ? R.string.clips_ord_added_subtitle : R.string.clips_no_ord_subtitle), skp.d.a, true, null, "ClipOrd", 704);
            }
            if (r11 instanceof ClipUploadItem.Cell.Default.a) {
                return new hze(apa.a, tq.h(tlo0.Companion, R.string.clips_publish_allow_comments_title), new tlo0.f(R.string.clips_publish_allow_comments_subtitle), new skp.f(((ClipUploadItem.Cell.Default.a) r11).a), true, null, "ClipAllowComments", 704);
            }
            if (r11 instanceof ClipUploadItem.Cell.Default.b) {
                return new hze(bpa.a, tq.h(tlo0.Companion, R.string.clips_publish_allow_duets_title), new tlo0.f(R.string.clips_publish_allow_duets_subtitle), new skp.f(((ClipUploadItem.Cell.Default.b) r11).a), true, null, "ClipAllowDuets", 704);
            }
            if (r11 instanceof ClipUploadItem.Cell.Default.PostToWall) {
                epa epaVar = epa.a;
                tlo0.a aVar = tlo0.Companion;
                ((ClipUploadItem.Cell.Default.PostToWall) r11).getClass();
                int[] iArr = a.$EnumSwitchMapping$0;
                throw null;
            }
            if (r11 instanceof ClipUploadItem.Cell.Default.e) {
                ClipUploadItem.Cell.Default.e eVar = (ClipUploadItem.Cell.Default.e) r11;
                fpa fpaVar = new fpa(eVar.a, eVar.b);
                tlo0.f h = tq.h(tlo0.Companion, R.string.clips_publish_date_selector_title);
                Long l = eVar.a;
                return new hze(fpaVar, h, l != null ? new tlo0.h((CharSequence) eVar.c.invoke(Long.valueOf(l.longValue()))) : new tlo0.f(R.string.clips_publish_delayed_publication_now), skp.a.a, eVar.b, null, "ClipPublicationDate", 704);
            }
            if (!(r11 instanceof ClipUploadItem.Cell.Default.f)) {
                sdy.w();
                throw null;
            }
            ((ClipUploadItem.Cell.Default.f) r11).getClass();
            tlo0.a aVar2 = tlo0.Companion;
            int[] iArr2 = a.$EnumSwitchMapping$0;
            throw null;
        }
        ClipUploadItem.Cell.a aVar3 = (ClipUploadItem.Cell.a) cell;
        zoa.a aVar4 = new zoa.a(aVar3.c());
        fna icon = aVar3.getIcon();
        if (icon == null) {
            gnaVar = gna.d.a;
        } else if (icon instanceof fna.b) {
            gnaVar = new gna.c(((fna.b) icon).a);
        } else if (icon instanceof fna.c) {
            gnaVar = new gna.b(((fna.c) icon).a);
        } else {
            if (!(icon instanceof fna.a)) {
                throw new NoWhenBranchMatchedException();
            }
            gnaVar = new gna.a(((fna.a) icon).a);
        }
        gna gnaVar2 = gnaVar;
        tlo0 title = aVar3.getTitle();
        tlo0 a2 = aVar3.a();
        rkp d = aVar3.d();
        if (epx.f(d, rkp.c.a)) {
            skpVar2 = skp.d.a;
        } else if (epx.f(d, rkp.d.a)) {
            skpVar2 = skp.e.a;
        } else {
            if (!epx.f(d, rkp.e.a)) {
                if (d instanceof rkp.f) {
                    ((rkp.f) d).getClass();
                    bVar = new skp.f(false);
                } else if (d instanceof rkp.b) {
                    rkp.b bVar3 = (rkp.b) d;
                    bVar3.getClass();
                    bVar = new skp.c(bVar3.a);
                } else {
                    if (!(d instanceof rkp.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = new skp.b(((rkp.a) d).a);
                }
                skpVar = bVar;
                boolean isEnabled = aVar3.isEnabled();
                List<pdf> e = aVar3.e();
                ArrayList arrayList = new ArrayList(c5g.u(e, 10));
                for (pdf pdfVar : e) {
                    arrayList.add(new yoa(pdfVar.a, pdfVar.b, pdfVar.c));
                }
                b = aVar3.b();
                if (b == null) {
                    b = uqi.a("CellId(value=", aVar3.c(), ')');
                }
                return new hze(aVar4, gnaVar2, title, a2, skpVar, isEnabled, arrayList, null, b, aVar3.getTooltipText());
            }
            skpVar2 = skp.a.a;
        }
        skpVar = skpVar2;
        boolean isEnabled2 = aVar3.isEnabled();
        List<pdf> e2 = aVar3.e();
        ArrayList arrayList2 = new ArrayList(c5g.u(e2, 10));
        while (r12.hasNext()) {
        }
        b = aVar3.b();
        if (b == null) {
        }
        return new hze(aVar4, gnaVar2, title, a2, skpVar, isEnabled2, arrayList2, null, b, aVar3.getTooltipText());
    }
}
