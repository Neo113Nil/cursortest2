package xsna;

import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$PostDraftItemEventType;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import xsna.jbc0;

/* compiled from: PostingAnalyticsImpl.kt */
/* loaded from: classes16.dex */
public final class nbc0 implements jbc0 {
    public static final nbc0 a = new nbc0();
    public static WeakReference<jbc0.b> b = new WeakReference<>(null);
    public static final Regex c = new Regex("#\\w+");

    @Override // xsna.jbc0
    public final void a(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
        mobileOfficialAppsCoreNavStat$EventScreen.name().toLowerCase(Locale.ROOT);
        if ((49151 & 256) != 0) {
            EmptyList emptyList = EmptyList.b;
        }
        if ((49151 & 512) != 0) {
            EmptyList emptyList2 = EmptyList.b;
        }
        if ((49151 & 32768) != 0) {
            EmptyList emptyList3 = EmptyList.b;
        }
    }

    @Override // xsna.jbc0
    public final List<String> b(CharSequence charSequence) {
        return rli0.A(new ulp0(Regex.d(c, charSequence), new k990(7)));
    }

    @Override // xsna.jbc0
    public final void c() {
        SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
        jbc0.b bVar = b.get();
        if (bVar != null) {
            bVar.i0();
        }
    }

    @Override // xsna.jbc0
    public final void d() {
        SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
        jbc0.b bVar = b.get();
        if (bVar != null) {
            bVar.i0();
        }
    }

    @Override // xsna.jbc0
    public final void e() {
        SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
        jbc0.b bVar = b.get();
        if (bVar != null) {
            bVar.i0();
        }
    }

    @Override // xsna.jbc0
    public final int f(CharSequence charSequence) {
        return drm0.c0(charSequence, new String[]{"\\s+"}, 0, 6).size();
    }

    @Override // xsna.jbc0
    public final void g() {
        jbc0.b bVar = b.get();
        if (bVar != null) {
            bVar.i0();
        }
    }

    @Override // xsna.jbc0
    public final void h(jbc0.b bVar) {
        b = new WeakReference<>(bVar);
    }
}
