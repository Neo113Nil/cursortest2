package xsna;

import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import xsna.gko;

/* compiled from: ToolbarActionBinder.kt */
/* loaded from: classes17.dex */
public final class y2p0 {
    public final fee a;
    public final VkTopBar b;
    public final boolean c;
    public final ArrayList d = new ArrayList();

    /* compiled from: ToolbarActionBinder.kt */
    public static abstract class a {

        /* compiled from: ToolbarActionBinder.kt */
        /* renamed from: xsna.y2p0$a$a, reason: collision with other inner class name */
        public static final class C4071a extends a {
            public final ClipGridParams.Data a;

            public C4071a(ClipGridParams.Data data) {
                this.a = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4071a) && epx.f(this.a, ((C4071a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "MoreAction(data=" + this.a + ')';
            }
        }

        /* compiled from: ToolbarActionBinder.kt */
        public static final class b extends a {
            public final ClipGridParams.Data a;

            public b(ClipGridParams.Data data) {
                this.a = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "OpenLandingAction(data=" + this.a + ')';
            }
        }

        /* compiled from: ToolbarActionBinder.kt */
        public static final class c extends a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1798062025;
            }

            public final String toString() {
                return "Settings";
            }
        }

        /* compiled from: ToolbarActionBinder.kt */
        public static final class d extends a {
            public final ClipGridParams.Data a;

            public d(ClipGridParams.Data data) {
                this.a = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "ShareAction(data=" + this.a + ')';
            }
        }
    }

    public y2p0(fee feeVar, VkTopBar vkTopBar, boolean z) {
        this.a = feeVar;
        this.b = vkTopBar;
        this.c = z;
    }

    public static VkTopBar.a.b.C0877b c(int i, int i2, com.vk.core.compose.component.semantics.a aVar, VkTopBar.l.a aVar2, gzs gzsVar) {
        gko.b bVar = gko.Companion;
        return new VkTopBar.a.b.C0877b(new gko(i), tq.h(tlo0.Companion, i2), gzsVar, aVar2, null, aVar, 16);
    }

    public static VkTopBar.a.c.f d(int i, int i2, com.vk.core.compose.component.semantics.a aVar, VkTopBar.l.a aVar2, gzs gzsVar) {
        gko.b bVar = gko.Companion;
        return new VkTopBar.a.c.f(new gko(i), tq.h(tlo0.Companion, i2), gzsVar, aVar2, null, aVar, 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Set<? extends a> set) {
        Triple triple;
        Triple triple2;
        a aVar;
        VkTopBar.a.c.f d;
        ArrayList arrayList = this.d;
        arrayList.clear();
        Iterator<T> it = set.iterator();
        while (true) {
            if (it.hasNext()) {
                a aVar2 = (a) it.next();
                boolean z = aVar2 instanceof a.d;
                boolean z2 = this.c;
                fee feeVar = this.a;
                if (z) {
                    ClipGridParams.Data data = ((a.d) aVar2).a;
                    if (!feeVar.F0() || !z2) {
                        if (data instanceof ClipGridParams.Data.Music) {
                            ClipGridParams.Data.Music music = (ClipGridParams.Data.Music) data;
                            MusicTrack musicTrack = music.b;
                            if (musicTrack.K != null) {
                                if (!o25.a().a(musicTrack.c) && music.i) {
                                }
                            }
                        }
                        arrayList.add(new a.d(data));
                    }
                } else if (aVar2 instanceof a.C4071a) {
                    ClipGridParams.Data data2 = ((a.C4071a) aVar2).a;
                    ClipGridParams.Data.Music music2 = data2 instanceof ClipGridParams.Data.Music ? (ClipGridParams.Data.Music) data2 : null;
                    MusicTrack musicTrack2 = music2 != null ? music2.b : null;
                    boolean z3 = ((musicTrack2 != null ? musicTrack2.K : null) == null || o25.a().a(musicTrack2.c)) ? false : true;
                    boolean z4 = data2 instanceof ClipGridParams.Data.Profile;
                    if (z2 || ((z4 && !feeVar.F0()) || z3)) {
                        arrayList.add(new a.C4071a(data2));
                    }
                } else if (aVar2 instanceof a.c) {
                    if (feeVar.X1()) {
                        arrayList.add(a.c.a);
                    }
                } else {
                    if (!(aVar2 instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ClipGridParams.Data data3 = ((a.b) aVar2).a;
                    ClipGridParams.Data.Music music3 = data3 instanceof ClipGridParams.Data.Music ? (ClipGridParams.Data.Music) data3 : null;
                    if (music3 == null || !music3.j) {
                        ClipGridParams.Data.Hashtag hashtag = data3 instanceof ClipGridParams.Data.Hashtag ? (ClipGridParams.Data.Hashtag) data3 : null;
                        if (hashtag != null && hashtag.e) {
                        }
                    }
                    arrayList.add(new a.b(data3));
                }
            } else {
                int size = arrayList.size();
                if (1 > size || size >= 4) {
                    return;
                }
                List I0 = j5g.I0(3, arrayList);
                int size2 = I0.size();
                if (size2 == 1) {
                    triple = new Triple(I0.get(0), null, null);
                } else if (size2 == 2) {
                    triple = new Triple(I0.get(1), I0.get(0), null);
                } else {
                    if (size2 != 3) {
                        triple2 = new Triple(null, null, null);
                        aVar = (a) triple2.d();
                        a aVar3 = (a) triple2.g();
                        a aVar4 = (a) triple2.h();
                        if (aVar == null) {
                            if (aVar instanceof a.d) {
                                d = d(R.drawable.vk_icon_share_outline_28, R.string.accessibility_share, null, null, new com.vk.movika.sdk.base.ui.i(29, this, aVar));
                            } else if (aVar instanceof a.C4071a) {
                                d = d(R.drawable.vk_icon_more_vertical_28, R.string.clips_accessibility_more, com.vk.core.compose.component.semantics.b.a(null, new eni0(7), 3), null, new com.vk.movika.sdk.base.ui.k(24, this, aVar));
                            } else if (aVar instanceof a.c) {
                                d = d(R.drawable.vk_icon_settings_outline_28, R.string.accessibility_settings, null, null, new qjo0(this, 1));
                            } else {
                                if (!(aVar instanceof a.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                d = d(R.drawable.vk_icon_info_circle_outline_24, R.string.clips_grid_accessibility_trends_landing, null, null, new com.vk.movika.sdk.base.ui.m(26, this, aVar));
                            }
                            this.b.setAfter(new VkTopBar.a.d(d, aVar3 != null ? e(aVar3) : null, aVar4 != null ? e(aVar4) : null));
                            return;
                        }
                        return;
                    }
                    triple = new Triple(I0.get(2), I0.get(1), I0.get(0));
                }
                triple2 = triple;
                aVar = (a) triple2.d();
                a aVar32 = (a) triple2.g();
                a aVar42 = (a) triple2.h();
                if (aVar == null) {
                }
            }
        }
    }

    public final void b(ClipGridParams.Data data) {
        a(rl3.y0(new a[]{new a.b(data), new a.d(data), new a.C4071a(data), a.c.a}));
    }

    public final VkTopBar.a.b.C0877b e(a aVar) {
        if (aVar instanceof a.d) {
            return c(R.drawable.vk_icon_share_outline_28, R.string.accessibility_share, null, null, new com.vk.movika.sdk.base.flow.binding.g(26, this, aVar));
        }
        if (aVar instanceof a.C4071a) {
            return c(R.drawable.vk_icon_more_vertical_28, R.string.clips_accessibility_more, com.vk.core.compose.component.semantics.b.a(null, new e750(19), 3), null, new com.vk.movika.sdk.base.flow.binding.j(28, this, aVar));
        }
        if (aVar instanceof a.c) {
            return c(R.drawable.vk_icon_settings_outline_28, R.string.accessibility_settings, null, null, new stg0(this, 12));
        }
        if (aVar instanceof a.b) {
            return c(R.drawable.vk_icon_info_circle_outline_24, R.string.clips_grid_accessibility_trends_landing, null, null, new com.vk.movika.sdk.base.flow.binding.l(22, this, aVar));
        }
        throw new NoWhenBranchMatchedException();
    }
}
