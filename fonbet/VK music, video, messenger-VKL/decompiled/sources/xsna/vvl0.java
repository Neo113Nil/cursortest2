package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.StorySharingInfo;
import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.media.model.CameraVideoEncoderParameters;
import com.vk.story.api.domain.interactor.upload.IPersistingStoryUpload;
import com.vk.story.api.domain.interactor.upload.StoryMultiData;
import com.vk.story.api.domain.interactor.upload.StoryTaskParams;
import com.vk.story.api.media.StoryMediaData;
import com.vk.storycamera.upload.PersistingStoryUpload;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.text.Regex;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: StoriesUploadInteractorImpl.kt */
/* loaded from: classes6.dex */
public final class vvl0 implements uvl0 {
    public final lrl0 a;
    public final p870 b;
    public final b25 c;
    public final tov d;
    public final bsl0 e;
    public final otl0 f;
    public boolean g = true;
    public final cv6 h;

    public vvl0(lrl0 lrl0Var, p870 p870Var, b25 b25Var, tvl0 tvl0Var, bsl0 bsl0Var, otl0 otl0Var) {
        this.a = lrl0Var;
        this.b = p870Var;
        this.c = b25Var;
        this.d = tvl0Var;
        this.e = bsl0Var;
        this.f = otl0Var;
        init();
        this.h = new cv6();
    }

    public static void s(zjm0 zjm0Var, String str) {
        CommonUploadParams commonUploadParams = zjm0Var.j;
        Integer num = commonUploadParams != null ? commonUploadParams.l : null;
        String str2 = commonUploadParams != null ? commonUploadParams.n : null;
        if (num == null || str2 == null) {
            return;
        }
        fxv0.a.a(new ixv0(num.intValue(), str2, str));
    }

    @Override // xsna.uvl0
    public final void a(int i) {
        tov tovVar = this.d;
        IPersistingStoryUpload p = tovVar.p(i);
        if (p != null) {
            p.V7().i = false;
            p.V7().h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            tovVar.s(p);
            tovVar.o(p);
            p870 p870Var = this.b;
            p870Var.c(110);
            p870Var.e(ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, p.V7());
            q(p.V7());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015a A[EDGE_INSN: B:60:0x015a->B:61:0x015a BREAK  A[LOOP:2: B:47:0x00b5->B:53:0x0151], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x020b  */
    @Override // xsna.uvl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(StoryMultiData storyMultiData) {
        boolean z;
        int i;
        Iterator<StoryMediaData> it;
        int i2;
        boolean hasNext;
        tov tovVar;
        p870 p870Var;
        boolean isEmpty;
        PersistingStoryUpload i3;
        int q;
        File file;
        File file2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<StoryMediaData> list = storyMultiData.b;
        List<StoryMediaData> list2 = list;
        for (StoryMediaData storyMediaData : j5g.y0(list2)) {
            CameraVideoEncoderParameters cameraVideoEncoderParameters = storyMediaData.c;
            if (cameraVideoEncoderParameters != null && (file2 = cameraVideoEncoderParameters.r) != null) {
                StoryUploadParams storyUploadParams = storyMediaData.d;
                if (!linkedHashSet.contains(file2)) {
                    storyUploadParams.p = Boolean.TRUE;
                    linkedHashSet.add(file2);
                }
                storyUploadParams.o = Boolean.TRUE;
            }
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = j5g.y0(list2).iterator();
        while (true) {
            z = true;
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            StoryMediaData storyMediaData2 = (StoryMediaData) it2.next();
            CameraVideoEncoderParameters cameraVideoEncoderParameters2 = storyMediaData2.c;
            if (cameraVideoEncoderParameters2 != null && (file = cameraVideoEncoderParameters2.b) != null) {
                StoryUploadParams storyUploadParams2 = storyMediaData2.d;
                if (linkedHashSet2.contains(file)) {
                    storyUploadParams2.J = true;
                } else {
                    storyUploadParams2.J = false;
                    linkedHashSet2.add(file);
                }
            }
        }
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        CommonUploadParams commonUploadParams = storyMultiData.d;
        ArrayList arrayList = new ArrayList();
        if (list.size() > 1) {
            List<StoryMediaData> list3 = list;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    if (!((StoryMediaData) it3.next()).e) {
                    }
                }
            }
            this.g = z;
            it = list.iterator();
            i2 = 0;
            while (true) {
                hasNext = it.hasNext();
                tovVar = this.d;
                p870Var = this.b;
                if (hasNext) {
                    break;
                }
                StoryMediaData next = it.next();
                StoryUploadParams storyUploadParams3 = next.d;
                if (this.g) {
                    arrayList.add(next);
                } else {
                    if (next.e) {
                        File file3 = next.b;
                        storyUploadParams3.O = sxc0.a().i();
                        StoryTaskParams storyTaskParams = new StoryTaskParams();
                        storyTaskParams.b = file3;
                        storyTaskParams.e = commonUploadParams;
                        storyTaskParams.f = storyUploadParams3;
                        PersistingStoryUpload i4 = this.d.i(true, file3, null, storyTaskParams, storyUploadParams3);
                        q = tovVar.n(i4);
                        p870Var.c(110);
                        p870Var.e(ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, i4.V7());
                        q(i4.V7());
                    } else {
                        CameraVideoEncoderParameters cameraVideoEncoderParameters3 = next.c;
                        storyUploadParams3.O = sxc0.a().i();
                        StoryTaskParams storyTaskParams2 = new StoryTaskParams();
                        storyTaskParams2.c = cameraVideoEncoderParameters3;
                        storyTaskParams2.e = commonUploadParams;
                        storyTaskParams2.f = storyUploadParams3;
                        PersistingStoryUpload i5 = this.d.i(false, cameraVideoEncoderParameters3.b, cameraVideoEncoderParameters3.d, storyTaskParams2, storyUploadParams3);
                        q = tovVar.q(i5, storyTaskParams2);
                        p870Var.c(110);
                        p870Var.e(ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, i5.V7());
                        q(i5.V7());
                    }
                    i2 = q;
                }
                linkedHashSet3.add(Integer.valueOf(i2));
            }
            isEmpty = arrayList.isEmpty();
            cv6 cv6Var = this.h;
            if (!isEmpty) {
                cv6Var.a(linkedHashSet3.size(), linkedHashSet3);
                return i2;
            }
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    StoryMediaData storyMediaData3 = (StoryMediaData) it4.next();
                    StoryUploadParams storyUploadParams4 = storyMediaData3.d;
                    if (storyMediaData3.e) {
                        File file4 = storyMediaData3.b;
                        storyUploadParams4.O = sxc0.a().i();
                        StoryTaskParams storyTaskParams3 = new StoryTaskParams();
                        storyTaskParams3.b = file4;
                        storyTaskParams3.e = commonUploadParams;
                        storyTaskParams3.f = storyUploadParams4;
                        i3 = this.d.i(true, file4, null, storyTaskParams3, storyUploadParams4);
                    } else {
                        CameraVideoEncoderParameters cameraVideoEncoderParameters4 = storyMediaData3.c;
                        storyUploadParams4.O = sxc0.a().i();
                        StoryTaskParams storyTaskParams4 = new StoryTaskParams();
                        storyTaskParams4.c = cameraVideoEncoderParameters4;
                        storyTaskParams4.e = commonUploadParams;
                        storyTaskParams4.f = storyUploadParams4;
                        i3 = this.d.i(false, cameraVideoEncoderParameters4.b, cameraVideoEncoderParameters4.d, storyTaskParams4, storyUploadParams4);
                        tovVar.g(i3, storyTaskParams4);
                    }
                    q(i3.V7());
                    arrayList2.add(i3);
                }
                i = tovVar.t(arrayList2);
                p870Var.c(110);
                p870Var.e(ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, tovVar.k(i));
            }
            p870Var.c(110);
            this.e.a();
            cv6Var.a(arrayList.size(), Collections.singleton(Integer.valueOf(i)));
            return i;
        }
        z = false;
        this.g = z;
        it = list.iterator();
        i2 = 0;
        while (true) {
            hasNext = it.hasNext();
            tovVar = this.d;
            p870Var = this.b;
            if (hasNext) {
            }
            linkedHashSet3.add(Integer.valueOf(i2));
        }
        isEmpty = arrayList.isEmpty();
        cv6 cv6Var2 = this.h;
        if (!isEmpty) {
        }
    }

    @Override // xsna.uvl0
    public final void c(int i) {
        tov tovVar = this.d;
        zjm0 f = tovVar.f(i);
        if (f != null) {
            File file = f.e;
            Regex regex = com.vk.core.files.a.a;
            vhk0.b(file);
            vhk0.b(f.f);
            tovVar.l(f);
            if (p(f)) {
                p870 p870Var = this.b;
                p870Var.c(110);
                p870Var.e(109, f);
            }
            q(f);
            s(f, "User cancel upload story");
        }
    }

    @Override // xsna.uvl0
    public final void clear() {
        this.d.clear();
        this.b.c(110);
        this.a.clear();
    }

    @Override // xsna.uvl0
    public final boolean d(StoriesContainer storiesContainer) {
        CopyOnWriteArrayList<StoryEntry> copyOnWriteArrayList = storiesContainer.g;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (g(((StoryEntry) it.next()).c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        if (r3 != (-1)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r1 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        r1 = r1.intValue();
        r3 = (java.util.Set) r0.b.get(r1);
        r3.remove(java.lang.Integer.valueOf(r11));
        r4 = (xsna.cv6.a) r0.c.get(r1);
        r0.c.set(r1, new xsna.cv6.a(r4.a, r4.b + r14, r4.c + r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        if (r3.isEmpty() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        r13 = (xsna.cv6.a) r0.c.get(r1);
        r14 = (xsna.z6m0) r0.d.getValue();
        r3 = r13.a;
        r4 = r13.b;
        r6 = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(r13.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
    
        if (r6 >= 1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008e, code lost:
    
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
    
        r14.b(r3, r4 / ((int) r6));
        r0.b.remove(r1);
        r0.c.remove(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0032, code lost:
    
        r1 = java.lang.Integer.valueOf(r3);
     */
    @Override // xsna.uvl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(int i, StoryEntry storyEntry, int i2, int i3) {
        zjm0 k;
        cv6 cv6Var = this.h;
        synchronized (cv6Var) {
            Iterator it = cv6Var.b.iterator();
            int i4 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i4 = -1;
                    break;
                }
                Object next = it.next();
                if (i4 < 0) {
                    e43.t();
                    throw null;
                }
                if (((Set) next).contains(Integer.valueOf(i))) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        zjm0 a = this.d.a(i);
        if (a != null) {
            r(a, storyEntry);
        } else {
            if (!this.d.d(i) || (k = this.d.k(i)) == null) {
                return;
            }
            itg0.k(this.f.b(null, false), null, null, 3);
            r(k, storyEntry);
            this.d.b(i);
        }
    }

    @Override // xsna.uvl0
    public final List f(int i, UserId userId) {
        return this.d.c(i, userId);
    }

    @Override // xsna.uvl0
    public final boolean g(int i) {
        zjm0 f = this.d.f(i);
        return p(f) && f != null && f.i;
    }

    @Override // xsna.uvl0
    public final float h(int i) {
        zjm0 f = this.d.f(i);
        return f != null ? f.h : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.uvl0
    public final void i(int i, File file) {
        zjm0 a = this.d.a(i);
        if (a != null) {
            a.f = file;
            this.b.e(105, a);
        }
    }

    @Override // xsna.uvl0
    public final void init() {
        this.d.h(this.c.c(), new bnc0(this, 12));
    }

    @Override // xsna.uvl0
    public final boolean j(int i) {
        return this.d.f(i) != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        if (r3 != (-1)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r1 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        r1 = r1.intValue();
        ((xsna.z6m0) r0.d.getValue()).c(((xsna.cv6.a) r0.c.get(r1)).a);
        r0.b.remove(r1);
        r0.c.remove(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0032, code lost:
    
        r1 = java.lang.Integer.valueOf(r3);
     */
    @Override // xsna.uvl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(int i, String str) {
        cv6 cv6Var = this.h;
        synchronized (cv6Var) {
            Iterator it = cv6Var.b.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                Object next = it.next();
                if (i2 < 0) {
                    e43.t();
                    throw null;
                }
                if (((Set) next).contains(Integer.valueOf(i))) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        zjm0 r = this.d.r(i, str);
        if (r != null && p(r)) {
            boolean equals = "video".equals(r.d);
            boolean z = equals && r.h <= 0.75f;
            boolean z2 = !equals || r.h > 0.75f;
            b.d dVar = new b.d("story_upload_failed");
            dVar.a(Boolean.valueOf(equals), "is_video");
            dVar.a(Boolean.valueOf(z), "encode_error");
            dVar.a(Boolean.valueOf(z2), "upload_error");
            dVar.e();
            this.b.e(104, r);
            q(r);
            s(r, null);
        }
    }

    @Override // xsna.uvl0
    public final int l(StoriesContainer storiesContainer) {
        CopyOnWriteArrayList<StoryEntry> copyOnWriteArrayList = storiesContainer.g;
        int i = 0;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.isEmpty()) {
            return 0;
        }
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (g(((StoryEntry) it.next()).c) && (i = i + 1) < 0) {
                e43.s();
                throw null;
            }
        }
        return i;
    }

    @Override // xsna.uvl0
    public final boolean m(int i) {
        return this.d.f(i) != null;
    }

    @Override // xsna.uvl0
    public final boolean n(int i) {
        zjm0 f = this.d.f(i);
        if (f != null) {
            return p(f) && f.i;
        }
        return true;
    }

    @Override // xsna.uvl0
    public final void o(int i, int i2) {
        zjm0 a = this.d.a(i);
        if (a != null && p(a)) {
            a.h = i2 / 100;
            this.b.e(103, a);
        }
    }

    public final boolean p(zjm0 zjm0Var) {
        if (zjm0Var == null) {
            return false;
        }
        return epx.f(zjm0Var.j.b, this.c.c());
    }

    public final void q(zjm0 zjm0Var) {
        CommonUploadParams commonUploadParams = zjm0Var.j;
        if (commonUploadParams.c || (commonUploadParams.Mb() && !commonUploadParams.f.b.E)) {
            this.f.a();
        }
    }

    public final void r(zjm0 zjm0Var, StoryEntry storyEntry) {
        tov tovVar = this.d;
        tovVar.e(zjm0Var);
        if (p(zjm0Var)) {
            storyEntry.C = true;
            zjm0Var.g = storyEntry;
            p870 p870Var = this.b;
            p870Var.c(110);
            p870Var.e(102, zjm0Var);
            StorySharingInfo storySharingInfo = zjm0Var.j.g;
            if (storySharingInfo != null && storySharingInfo.j) {
                cvk.u(R.string.story_sent, false);
            }
            if (storyEntry.s0) {
                sxc0.a().l(zjm0Var.k.y);
            }
            if (tovVar.m()) {
                CommonUploadParams commonUploadParams = zjm0Var.j;
                if (commonUploadParams.c || (commonUploadParams.Mb() && !commonUploadParams.f.b.E)) {
                    itg0.k(this.f.b(null, false), null, null, 3);
                }
            }
            if (storyEntry.Ab() != null) {
                File file = zjm0Var.f;
                Regex regex = com.vk.core.files.a.a;
                vhk0.d(file);
            }
            p870Var.e(113, storyEntry.getId());
            CommonUploadParams commonUploadParams2 = zjm0Var.j;
            Integer num = commonUploadParams2 != null ? commonUploadParams2.l : null;
            String str = commonUploadParams2 != null ? commonUploadParams2.n : null;
            if (num == null || str == null) {
                return;
            }
            fxv0.a.a(new jxv0(num.intValue(), storyEntry.d.b, storyEntry.c, str));
        }
    }
}
