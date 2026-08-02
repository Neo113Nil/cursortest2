package xsna;

import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.newsfeed.Owner;
import com.vk.fave.FaveItem;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.header.SourcePhoto;
import com.vkontakte.android.attachments.PodcastAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.qn60;

/* compiled from: StoriesMarkAllAsSeenEditorAction.kt */
/* loaded from: classes4.dex */
public final class stl0 implements qn60.b {
    public final UserId a;
    public final pn60 b;

    /* compiled from: StoriesMarkAllAsSeenEditorAction.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Object, Boolean> {
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0067, code lost:
        
            if (xsna.epx.f(r6 != null ? r6.b : null, r0) == false) goto L40;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x004b  */
        @Override // xsna.izs
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean invoke(Object obj) {
            boolean z;
            FaveEntry faveEntry;
            FaveItem faveItem;
            gmq gmqVar;
            SourcePhoto sourcePhoto;
            Owner d;
            UserId userId = ((stl0) this.receiver).a;
            boolean z2 = true;
            if (obj instanceof wee0) {
                Owner G = ((wee0) obj).G();
                if (epx.f(G != null ? G.b : null, userId)) {
                    z = true;
                    if (obj instanceof wsx0) {
                        EntryHeader header = ((wsx0) obj).getHeader();
                        if (epx.f((header == null || (sourcePhoto = header.b) == null || (d = sourcePhoto.d()) == null) ? null : d.b, userId)) {
                            z = true;
                        }
                    }
                    faveEntry = !(obj instanceof FaveEntry) ? (FaveEntry) obj : null;
                    if (faveEntry != null && (faveItem = faveEntry.i) != null && (gmqVar = faveItem.f) != null) {
                        gnq.a.getClass();
                        Owner c = gnq.c(gmqVar);
                    }
                    z2 = z;
                    return Boolean.valueOf(z2);
                }
            }
            z = false;
            if (obj instanceof wsx0) {
            }
            if (!(obj instanceof FaveEntry)) {
            }
            if (faveEntry != null) {
                gnq.a.getClass();
                Owner c2 = gnq.c(gmqVar);
            }
            z2 = z;
            return Boolean.valueOf(z2);
        }
    }

    /* compiled from: StoriesMarkAllAsSeenEditorAction.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements wzs<Object, List<? extends ol60>, List<? extends ol60>> {
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0103  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x010c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0069  */
        @Override // xsna.wzs
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final List<? extends ol60> invoke(Object obj, List<? extends ol60> list) {
            boolean z;
            FaveEntry faveEntry;
            FaveItem faveItem;
            gmq gmqVar;
            Owner c;
            Owner s;
            SourcePhoto sourcePhoto;
            Owner d;
            SourcePhoto sourcePhoto2;
            SourcePhoto sourcePhoto3;
            Owner d2;
            SourcePhoto sourcePhoto4;
            Owner d3;
            List<? extends ol60> list2 = list;
            stl0 stl0Var = (stl0) this.receiver;
            UserId userId = stl0Var.a;
            boolean z2 = true;
            if (obj instanceof wee0) {
                wee0 wee0Var = (wee0) obj;
                Owner G = wee0Var.G();
                if (epx.f(G != null ? G.b : null, userId)) {
                    Owner G2 = wee0Var.G();
                    if (G2 != null) {
                        G2.q = false;
                    }
                    z = true;
                    if (obj instanceof wsx0) {
                        wsx0 wsx0Var = (wsx0) obj;
                        EntryHeader header = wsx0Var.getHeader();
                        if (epx.f((header == null || (sourcePhoto4 = header.b) == null || (d3 = sourcePhoto4.d()) == null) ? null : d3.b, userId)) {
                            EntryHeader header2 = wsx0Var.getHeader();
                            if (header2 != null && (sourcePhoto3 = header2.b) != null && (d2 = sourcePhoto3.d()) != null) {
                                d2.q = false;
                            }
                            z = true;
                        }
                    }
                    faveEntry = !(obj instanceof FaveEntry) ? (FaveEntry) obj : null;
                    if (faveEntry != null && (faveItem = faveEntry.i) != null && (gmqVar = faveItem.f) != null) {
                        gnq.a.getClass();
                        c = gnq.c(gmqVar);
                        if (epx.f(c == null ? c.b : null, userId)) {
                            z2 = z;
                        } else if (gmqVar instanceof ArticleAttachment) {
                            Owner owner = ((ArticleAttachment) gmqVar).f.h;
                            if (owner != null) {
                                owner.q = false;
                            }
                        } else if (gmqVar instanceof VideoAttachment) {
                            Owner s2 = ((VideoAttachment) gmqVar).k.s();
                            if (s2 != null) {
                                s2.q = false;
                            }
                        } else if (gmqVar instanceof PodcastAttachment) {
                            Owner owner2 = ((PodcastAttachment) gmqVar).g;
                            if (owner2 != null) {
                                owner2.q = false;
                            }
                        } else if (gmqVar instanceof Narrative) {
                            Owner owner3 = ((Narrative) gmqVar).f;
                            if (owner3 != null) {
                                owner3.q = false;
                            }
                        } else {
                            if (gmqVar instanceof wsx0) {
                                wsx0 wsx0Var2 = (wsx0) gmqVar;
                                EntryHeader header3 = wsx0Var2.getHeader();
                                if (((header3 == null || (sourcePhoto2 = header3.b) == null) ? null : sourcePhoto2.d()) != null) {
                                    EntryHeader header4 = wsx0Var2.getHeader();
                                    if (header4 != null && (sourcePhoto = header4.b) != null && (d = sourcePhoto.d()) != null) {
                                        d.q = false;
                                    }
                                }
                            }
                            if ((gmqVar instanceof l490) && (s = ((l490) gmqVar).s()) != null) {
                                s.q = false;
                            }
                        }
                        z = z2;
                    }
                    return !z ? pn60.c(stl0Var.b, obj, null, null, 14) : list2;
                }
            }
            z = false;
            if (obj instanceof wsx0) {
            }
            if (!(obj instanceof FaveEntry)) {
            }
            if (faveEntry != null) {
                gnq.a.getClass();
                c = gnq.c(gmqVar);
                if (epx.f(c == null ? c.b : null, userId)) {
                }
                z = z2;
            }
            if (!z) {
            }
        }
    }

    public stl0(UserId userId, pn60 pn60Var) {
        this.a = userId;
        this.b = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        aVar.m(new a(1, this, stl0.class, "shouldInvalidate", "shouldInvalidate(Ljava/lang/Object;)Z", 0), new b(2, this, stl0.class, "replaceUiDtos", "replaceUiDtos(Ljava/lang/Object;Ljava/util/List;)Ljava/util/List;", 0));
    }
}
