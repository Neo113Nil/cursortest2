package xsna;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.Attachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.AudioAttachment;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.attachments.VideoSnippetAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.p4p;

/* compiled from: FragmentImplExt.kt */
/* loaded from: classes18.dex */
public final class lbs implements h5p {
    public static final lbs b = new lbs();
    public static final jai c = new jai(92607173, new jji(0), false);
    public static final Float[] d = {Float.valueOf(0.378f), Float.valueOf(0.387f), Float.valueOf(0.397f), Float.valueOf(0.404f), Float.valueOf(0.432f), Float.valueOf(0.464f)};
    public static final Float[] e = {Float.valueOf(0.909f), Float.valueOf(0.778f), Float.valueOf(0.263f)};

    public static final boolean A(int i) {
        return i == 51 || i == 59 || i == 227 || i == 353;
    }

    public static final void B(FragmentImpl fragmentImpl, l5l l5lVar) {
        if (fragmentImpl.isAdded()) {
            l5lVar.invoke();
        } else {
            fragmentImpl.D.a(new kbs(fragmentImpl, l5lVar));
        }
    }

    public static final boolean a(u880 u880Var, Attachment attachment) {
        ol60 ol60Var = u880Var.h;
        if (ol60Var == null) {
            return false;
        }
        if ((ol60Var instanceof k880) && (attachment instanceof AudioAttachment)) {
            return ((k880) ol60Var).h.contains(((AudioAttachment) attachment).f);
        }
        if ((ol60Var instanceof t880) && (attachment instanceof AudioPlaylistAttachment)) {
            return epx.f(((t880) ol60Var).h, ((AudioPlaylistAttachment) attachment).f);
        }
        if ((ol60Var instanceof y880) && (attachment instanceof AudioAttachment)) {
            return epx.f(((y880) ol60Var).h, ((AudioAttachment) attachment).f);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final u1c0 b(u1c0 u1c0Var, NewsEntry newsEntry, NewsEntry newsEntry2, int i) {
        k2n k2nVar;
        u1c0 u1c0Var2;
        if (u1c0Var instanceof u880) {
            u1c0Var2 = new u880(newsEntry, newsEntry2, i, ((u880) u1c0Var).q);
        } else if (u1c0Var instanceof k5i) {
            k5i k5iVar = (k5i) u1c0Var;
            u1c0Var2 = new k5i(newsEntry, newsEntry2, i, k5iVar.q, k5iVar.r);
        } else if (u1c0Var instanceof lsi) {
            lsi lsiVar = (lsi) u1c0Var;
            u1c0Var2 = new lsi(lsiVar.r, lsiVar.s);
        } else if (u1c0Var instanceof r74) {
            u1c0Var2 = new r74(i, ((r74) u1c0Var).q, newsEntry, newsEntry2);
        } else if (u1c0Var instanceof w84) {
            u1c0Var2 = new w84(newsEntry, newsEntry2, i, ((w84) u1c0Var).q);
        } else {
            if (u1c0Var instanceof iko0) {
                iko0 iko0Var = (iko0) u1c0Var;
                iko0 iko0Var2 = new iko0(newsEntry, newsEntry2, i, iko0Var.q, iko0Var.r, iko0Var.s, iko0Var.t, iko0Var.u);
                iko0Var2.v = iko0Var.v;
                k2nVar = iko0Var2;
            } else if (u1c0Var instanceof kqm0) {
                u1c0Var2 = new kqm0(newsEntry, newsEntry2, ((kqm0) u1c0Var).q);
            } else if (u1c0Var instanceof a160) {
                u1c0Var2 = new a160(newsEntry, newsEntry2, i, ((a160) u1c0Var).q);
            } else if (u1c0Var instanceof k2n) {
                k2n k2nVar2 = (k2n) u1c0Var;
                k2nVar = new k2n(newsEntry, newsEntry2, i, k2nVar2.q, k2nVar2.r, k2nVar2.s);
            } else if (u1c0Var instanceof p890) {
                u1c0Var2 = new p890(newsEntry, newsEntry2, ((p890) u1c0Var).q);
            } else if (u1c0Var instanceof f28) {
                f28 f28Var = new f28(newsEntry, newsEntry2, i);
                f28Var.q = ((f28) u1c0Var).q;
                u1c0Var2 = f28Var;
            } else {
                u1c0Var2 = new u1c0(newsEntry, newsEntry2, i);
            }
            u1c0Var2 = k2nVar;
        }
        k(u1c0Var2, u1c0Var);
        return u1c0Var2;
    }

    public static u1c0 c(u1c0 u1c0Var, NewsEntry newsEntry, NewsEntry newsEntry2, int i, int i2) {
        if ((i2 & 1) != 0) {
            newsEntry = u1c0Var.a;
        }
        if ((i2 & 2) != 0) {
            newsEntry2 = u1c0Var.b;
        }
        if ((i2 & 4) != 0) {
            i = u1c0Var.c;
        }
        return b(u1c0Var, newsEntry, newsEntry2, i);
    }

    public static final r74 d(r74 r74Var, Attachment attachment) {
        Attachment attachment2;
        Attachment attachment3 = r74Var.q;
        if ((attachment3 instanceof VideoSnippetAttachment) && (attachment instanceof VideoAttachment)) {
            attachment2 = ((VideoSnippetAttachment) attachment3).Pb(((VideoAttachment) attachment).k);
        } else if ((attachment3 instanceof PhotoAttachment) && (attachment instanceof PhotoAttachment)) {
            attachment2 = new PhotoAttachment(((PhotoAttachment) attachment).l);
            attachment2.b = attachment3.b;
        } else {
            attachment2 = attachment;
        }
        r74 r74Var2 = new r74(r74Var.c, attachment2, r74Var.a, r74Var.b);
        k(r74Var2, r74Var);
        j(attachment, attachment3);
        return r74Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0082, code lost:
    
        if (r1 != (-1)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0085, code lost:
    
        r4 = java.lang.Integer.valueOf(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        if (r4 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008b, code lost:
    
        r11 = new java.util.ArrayList(r14.j);
        r15 = xsna.alk.n(xsna.fz5.m(r2), r2, r7.a, r7.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a0, code lost:
    
        if (r15 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a2, code lost:
    
        r11.set(r4.intValue(), r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a9, code lost:
    
        r14 = new xsna.z5t(r14.h, r14.i, r11, r14.k, r14.l);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [xsna.ol60] */
    /* JADX WARN: Type inference failed for: r14v4, types: [xsna.ol60] */
    /* JADX WARN: Type inference failed for: r14v5, types: [xsna.z5t] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final w84 e(w84 w84Var, Attachment attachment) {
        List<Attachment> list = w84Var.q;
        Integer j = p4g.j(attachment, list);
        if (j == null) {
            return w84Var;
        }
        int intValue = j.intValue();
        Attachment attachment2 = (Attachment) j5g.b0(intValue, list);
        Attachment Pb = ((attachment2 instanceof VideoSnippetAttachment) && (attachment instanceof VideoAttachment)) ? ((VideoSnippetAttachment) attachment2).Pb(((VideoAttachment) attachment).k) : attachment;
        ArrayList arrayList = new ArrayList(list);
        arrayList.set(intValue, Pb);
        w84 w84Var2 = new w84(w84Var.a, w84Var.b, w84Var.c, arrayList);
        k(w84Var2, w84Var);
        j(Pb, list.get(intValue));
        ?? r14 = w84Var2.h;
        if (r14 instanceof z5t) {
            r14 = (z5t) r14;
            Iterator it = r14.j.iterator();
            int i = 0;
            while (true) {
                Integer num = null;
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Object next = it.next();
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                if (epx.f(((v64) next).a(), attachment)) {
                    break;
                }
                i++;
            }
        }
        w84Var2.h = r14;
        return w84Var2;
    }

    public static final k5i g(k5i k5iVar, Attachment attachment) {
        Attachment attachment2 = k5iVar.q;
        k5i k5iVar2 = new k5i(k5iVar.a, k5iVar.b, k5iVar.c, ((attachment2 instanceof VideoSnippetAttachment) && (attachment instanceof VideoAttachment)) ? ((VideoSnippetAttachment) attachment2).Pb(((VideoAttachment) attachment).k) : attachment, k5iVar.r);
        k(k5iVar2, k5iVar);
        j(attachment, attachment2);
        return k5iVar2;
    }

    public static final lsi h(lsi lsiVar, Attachment attachment) {
        lsi lsiVar2 = new lsi(d(lsiVar.r, attachment), lsiVar.s);
        k(lsiVar2, lsiVar);
        return lsiVar2;
    }

    public static final u880 i(u880 u880Var) {
        u880 u880Var2 = new u880(u880Var.a, u880Var.b, u880Var.c, u880Var.q);
        k(u880Var2, u880Var);
        return u880Var2;
    }

    public static final void j(Attachment attachment, Attachment attachment2) {
        if ((attachment instanceof VideoAttachment) && (attachment2 instanceof VideoAttachment)) {
            VideoAttachment videoAttachment = (VideoAttachment) attachment2;
            ((VideoAttachment) attachment).Lb(videoAttachment.l, videoAttachment.g, videoAttachment.m);
        }
    }

    public static final void k(u1c0 u1c0Var, u1c0 u1c0Var2) {
        u1c0Var.d = u1c0Var2.d;
        u1c0Var.l = u1c0Var2.l;
        u1c0Var.m = u1c0Var2.m;
        u1c0Var.n = u1c0Var2.n;
        u1c0Var.f = u1c0Var2.f;
        u1c0Var.e = u1c0Var2.e;
        u1c0Var.g = u1c0Var2.g;
        u1c0Var.j = u1c0Var2.j;
        u1c0Var.h(u1c0Var2.k);
        u1c0Var.h = u1c0Var2.h;
    }

    public static final boolean l(FragmentImpl fragmentImpl) {
        ww50 v;
        FragmentActivity activity = fragmentImpl.getActivity();
        return (activity == null || (v = s200.v(activity)) == null || !v.k(fragmentImpl)) ? false : true;
    }

    public static final boolean m(BaseCatalogFragment baseCatalogFragment) {
        FragmentActivity activity = baseCatalogFragment.getActivity();
        if (activity != null) {
            s200.v(activity);
        }
        return false;
    }

    public static final boolean n(int i) {
        return i == 227;
    }

    public static final boolean o(FragmentImpl fragmentImpl) {
        ww50 v;
        FragmentActivity activity = fragmentImpl.getActivity();
        return (activity == null || (v = s200.v(activity)) == null || !v.C()) ? false : true;
    }

    public static final boolean p(int i) {
        return i == 372;
    }

    public static final boolean q(FragmentImpl fragmentImpl) {
        ww50 v;
        FragmentActivity activity = fragmentImpl.getActivity();
        return (activity == null || (v = s200.v(activity)) == null || !v.D(fragmentImpl, false)) ? false : true;
    }

    public static final boolean r(FragmentImpl fragmentImpl) {
        Fragment parentFragment;
        Fragment parentFragment2 = fragmentImpl.getParentFragment();
        FragmentImpl fragmentImpl2 = parentFragment2 instanceof FragmentImpl ? (FragmentImpl) parentFragment2 : null;
        return (fragmentImpl2 != null && fragmentImpl2.Mn()) || ((parentFragment = fragmentImpl.getParentFragment()) != null && parentFragment.isHidden());
    }

    public static final boolean s(int i) {
        if (i == 215 || i == 293 || i == 352 || i == 219 || i == 220 || i == 257 || i == 258 || i == 344 || i == 345) {
            return true;
        }
        switch (i) {
            case 203:
            case 204:
            case 205:
            case 206:
            case 207:
            case INVALID_BID_PAYLOAD_VALUE:
                return true;
            default:
                switch (i) {
                    case AD_NOT_LOADED_VALUE:
                    case 211:
                    case PLACEMENT_SLEEP_VALUE:
                    case INVALID_ADUNIT_BID_PAYLOAD_VALUE:
                        return true;
                    default:
                        return false;
                }
        }
    }

    public static final boolean t(int i) {
        return i == 178;
    }

    public static final boolean u(int i) {
        return i == 303;
    }

    public static final boolean v(int i) {
        return i == 11 || i == 50 || i == 23 || i == 24 || i == 52 || i == 53 || i == 110 || i == 111;
    }

    public static final boolean w(int i) {
        return i == 42 || i == 81 || i == 148;
    }

    public static final boolean x(int i) {
        return i == 41 || i == 70 || i == 96 || i == 45 || i == 46;
    }

    public static final boolean y(int i) {
        return i == 2 || i == 25 || i == 37;
    }

    public static final boolean z(int i) {
        return i == 5 || i == 189;
    }

    @Override // xsna.h5p
    public Object f(i4p i4pVar, ota0 ota0Var, Integer num, g5p g5pVar, p4p.b bVar) {
        return ota0Var;
    }
}
