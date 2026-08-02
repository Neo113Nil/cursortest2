package xsna;

import com.vk.catalog2.common.dto.api.CatalogCatalog;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.dto.music.MusicTrack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import xsna.k840;

/* compiled from: CachingResponseTransformer.kt */
/* loaded from: classes16.dex */
public final class fz8 implements jda {
    public final jda b;
    public final t5a<MusicTrack> c;
    public final LinkedHashMap d = new LinkedHashMap();

    /* compiled from: CachingResponseTransformer.kt */
    public static final class a {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CacheKeys(block=");
            sb.append(this.a);
            sb.append(", page=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: CachingResponseTransformer.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogDataType.values().length];
            try {
                iArr[CatalogDataType.DATA_TYPE_MUSIC_TRACKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_PODCAST_EPISODES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_SHORT_VIDEO_AUDIOS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public fz8(jda jdaVar, t5a<MusicTrack> t5aVar) {
        this.b = jdaVar;
        this.c = t5aVar;
        r5v0 r5v0Var = k840.a.h;
        new io.reactivex.rxjava3.internal.operators.observable.i0((r5v0Var == null ? null : r5v0Var).a.a.b0(ib50.class), new lp0(new ak(4), 8)).subscribe(new vl0(new s6(this, 14), 6));
    }

    @Override // xsna.jda
    public final List<UIBlock> b(Object obj, CatalogExtendedData catalogExtendedData, boolean z, boolean z2) {
        if (obj instanceof CatalogSection) {
            Iterator<T> it = ((CatalogSection) obj).i.iterator();
            while (it.hasNext()) {
                c((CatalogBlock) it.next(), catalogExtendedData);
            }
        } else if (obj instanceof CatalogBlock) {
            c((CatalogBlock) obj, catalogExtendedData);
        } else if (obj instanceof CatalogCatalog) {
            Iterator<T> it2 = ((CatalogCatalog) obj).b.iterator();
            while (it2.hasNext()) {
                Iterator<T> it3 = ((CatalogSection) it2.next()).i.iterator();
                while (it3.hasNext()) {
                    c((CatalogBlock) it3.next(), catalogExtendedData);
                }
            }
        }
        return jda.a(this.b, obj, catalogExtendedData, false, z2, 4);
    }

    public final void c(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData) {
        int i = b.$EnumSwitchMapping$0[catalogBlock.c.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            String str = catalogBlock.b;
            String str2 = catalogBlock.f;
            if (str2 == null) {
                str2 = "";
            }
            ArrayList E = g5g.E(catalogBlock.Gb(catalogExtendedData), MusicTrack.class);
            pn00.q(this.d, new ulp0(new i5g(E), new u6(3, str, str2)));
            this.c.a(str, str2, E);
        }
    }
}
