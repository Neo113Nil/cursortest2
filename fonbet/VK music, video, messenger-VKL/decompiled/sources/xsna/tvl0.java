package xsna;

import android.content.Context;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.log.L;
import com.vk.story.api.domain.interactor.upload.IPersistingStoryUpload;
import com.vk.story.api.domain.interactor.upload.StoryTaskParams;
import com.vk.storycamera.upload.PersistingStoryUpload;
import com.vk.storycamera.upload.VideoStoryUploadTask;
import com.vk.upload.impl.UploadNotification;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.text.Regex;
import xsna.p4g;

/* compiled from: StoriesUploadDelegate.kt */
/* loaded from: classes11.dex */
public final class tvl0 implements tov {
    public final CopyOnWriteArrayList<IPersistingStoryUpload> a = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<IPersistingStoryUpload> b = new CopyOnWriteArrayList<>();
    public final ConcurrentHashMap<Integer, List<IPersistingStoryUpload>> c = new ConcurrentHashMap<>();
    public UserId d;

    public static void w(IPersistingStoryUpload iPersistingStoryUpload, String str) {
        PrivateFiles.a b;
        if (iPersistingStoryUpload.O6() == null) {
            File file = new File(str);
            String name = file.getName();
            Regex regex = com.vk.core.files.a.a;
            PrivateFiles privateFiles = e8r.a;
            PrivateSubdir privateSubdir = PrivateSubdir.STORIES_FAILED_UPLOAD;
            privateFiles.getClass();
            b = privateFiles.b(privateSubdir, privateSubdir.h(), true);
            File file2 = new File(b.a, name);
            com.vk.core.files.a.b(file, file2);
            iPersistingStoryUpload.V3(file2.getAbsolutePath());
        }
    }

    @Override // xsna.tov
    public final zjm0 a(int i) {
        IPersistingStoryUpload v = v(i);
        if (v != null) {
            return v.V7();
        }
        return null;
    }

    @Override // xsna.tov
    public final void b(int i) {
        this.c.remove(Integer.valueOf(i));
    }

    @Override // xsna.tov
    public final ArrayList c(int i, UserId userId) {
        ArrayList u0 = j5g.u0(this.a, c5g.v(this.c.values()));
        ArrayList arrayList = new ArrayList();
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((IPersistingStoryUpload) next).V7().d(i, userId)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((IPersistingStoryUpload) it2.next()).V7());
        }
        return arrayList2;
    }

    @Override // xsna.tov
    public final void clear() {
        PrivateFiles.a b;
        this.c.clear();
        this.a.clear();
        this.b.clear();
        wmi0.a.c("story.persist.failed.uploads");
        Regex regex = com.vk.core.files.a.a;
        PrivateFiles privateFiles = e8r.a;
        PrivateSubdir privateSubdir = PrivateSubdir.STORIES_FAILED_UPLOAD;
        privateFiles.getClass();
        b = privateFiles.b(privateSubdir, privateSubdir.h(), true);
        vhk0.b(b.a);
    }

    @Override // xsna.tov
    public final boolean d(int i) {
        return this.c.containsKey(Integer.valueOf(i));
    }

    @Override // xsna.tov
    public final void e(zjm0 zjm0Var) {
        String O6;
        IPersistingStoryUpload u = u(zjm0Var.a);
        j6l0 j6l0Var = new j6l0(zjm0Var, 3);
        p4g.a aVar = p4g.a;
        Iterator<Map.Entry<Integer, List<IPersistingStoryUpload>>> it = this.c.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((Boolean) j6l0Var.invoke(it.next())).booleanValue()) {
                it.remove();
                break;
            }
        }
        this.a.remove(u);
        CopyOnWriteArrayList<IPersistingStoryUpload> copyOnWriteArrayList = this.b;
        copyOnWriteArrayList.remove(u);
        if (u != null && (O6 = u.O6()) != null) {
            File file = new File(O6);
            Regex regex = com.vk.core.files.a.a;
            vhk0.d(file);
        }
        wmi0.a.m("story.persist.failed.uploads", copyOnWriteArrayList);
    }

    @Override // xsna.tov
    public final zjm0 f(int i) {
        IPersistingStoryUpload u = u(i);
        if (u != null) {
            return u.V7();
        }
        return null;
    }

    @Override // xsna.tov
    public final void g(IPersistingStoryUpload iPersistingStoryUpload, StoryTaskParams storyTaskParams) {
        VideoStoryUploadTask videoStoryUploadTask = (VideoStoryUploadTask) iPersistingStoryUpload.d9();
        videoStoryUploadTask.y = storyTaskParams.zb();
        videoStoryUploadTask.z = storyTaskParams;
    }

    @Override // xsna.tov
    public final void h(UserId userId, bnc0 bnc0Var) {
        this.d = userId;
        wmi0 wmi0Var = wmi0.a;
        asu0 asu0Var = asu0.a;
        wmi0Var.f("story.persist.failed.uploads", asu0Var.c()).U(new kxa0(new tcu(28), 7)).r0(asu0Var.c()).a0(asu0Var.d()).U(new com.vk.movika.sdk.base.hooks.f(new t440(userId, 25), 29)).subscribe(new lkz(new evh0(3, this, bnc0Var), 20));
        L.e("Stories upload delegate init");
    }

    @Override // xsna.tov
    public final PersistingStoryUpload i(boolean z, File file, File file2, StoryTaskParams storyTaskParams, StoryUploadParams storyUploadParams) {
        return new PersistingStoryUpload(z, file, file2, storyTaskParams, storyUploadParams, null);
    }

    @Override // xsna.tov
    public final ArrayList j() {
        ArrayList u0 = j5g.u0(this.a, c5g.v(this.c.values()));
        ArrayList arrayList = new ArrayList();
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((IPersistingStoryUpload) next).V7().b()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((IPersistingStoryUpload) it2.next()).V7());
        }
        return arrayList2;
    }

    @Override // xsna.tov
    public final zjm0 k(int i) {
        IPersistingStoryUpload iPersistingStoryUpload;
        List<IPersistingStoryUpload> list = this.c.get(Integer.valueOf(i));
        if (list == null || (iPersistingStoryUpload = (IPersistingStoryUpload) j5g.Y(list)) == null) {
            return null;
        }
        return iPersistingStoryUpload.V7();
    }

    @Override // xsna.tov
    public final void l(zjm0 zjm0Var) {
        com.vk.upload.impl.a.b(zjm0Var.b, null);
        e(zjm0Var);
    }

    @Override // xsna.tov
    public final boolean m() {
        return this.a.isEmpty();
    }

    @Override // xsna.tov
    public final int n(IPersistingStoryUpload iPersistingStoryUpload) {
        com.vk.upload.impl.b d9 = iPersistingStoryUpload.d9();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        com.vk.upload.impl.a.g(d9, new UploadNotification.a(null, context.getString(R.string.story_sent), null));
        int i = com.vk.upload.impl.a.i(d9);
        this.a.add(iPersistingStoryUpload);
        return i;
    }

    @Override // xsna.tov
    public final void o(IPersistingStoryUpload iPersistingStoryUpload) {
        int g = iPersistingStoryUpload.V7().g();
        if (com.vk.upload.impl.a.a(g)) {
            com.vk.upload.impl.a.e(g);
        } else {
            com.vk.upload.impl.a.i(iPersistingStoryUpload.d9());
        }
    }

    @Override // xsna.tov
    public final IPersistingStoryUpload p(int i) {
        return u(i);
    }

    @Override // xsna.tov
    public final int q(IPersistingStoryUpload iPersistingStoryUpload, StoryTaskParams storyTaskParams) {
        VideoStoryUploadTask videoStoryUploadTask = (VideoStoryUploadTask) iPersistingStoryUpload.d9();
        videoStoryUploadTask.y = storyTaskParams.zb();
        videoStoryUploadTask.z = storyTaskParams;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        com.vk.upload.impl.a.g(videoStoryUploadTask, new UploadNotification.a(null, context.getString(R.string.story_sent), null));
        int i = com.vk.upload.impl.a.i(videoStoryUploadTask);
        this.a.add(iPersistingStoryUpload);
        return i;
    }

    @Override // xsna.tov
    public final zjm0 r(int i, String str) {
        IPersistingStoryUpload iPersistingStoryUpload;
        CopyOnWriteArrayList<IPersistingStoryUpload> copyOnWriteArrayList = this.b;
        Iterator<IPersistingStoryUpload> it = copyOnWriteArrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                iPersistingStoryUpload = null;
                break;
            }
            iPersistingStoryUpload = it.next();
            if (iPersistingStoryUpload.V7().b == i) {
                break;
            }
        }
        IPersistingStoryUpload iPersistingStoryUpload2 = iPersistingStoryUpload;
        if (iPersistingStoryUpload2 != null) {
            iPersistingStoryUpload2.V7().f();
            if (str != null) {
                w(iPersistingStoryUpload2, str);
            }
            iPersistingStoryUpload2.V3(str);
            return iPersistingStoryUpload2.V7();
        }
        IPersistingStoryUpload v = v(i);
        if (v != null) {
            v.V7().f();
            if (str != null) {
                w(v, str);
            }
            copyOnWriteArrayList.add(v);
            wmi0.a.m("story.persist.failed.uploads", copyOnWriteArrayList);
        } else {
            v = null;
        }
        if (v != null) {
            return v.V7();
        }
        return null;
    }

    @Override // xsna.tov
    public final void s(IPersistingStoryUpload iPersistingStoryUpload) {
        CopyOnWriteArrayList<IPersistingStoryUpload> copyOnWriteArrayList = this.b;
        copyOnWriteArrayList.remove(iPersistingStoryUpload);
        wmi0.a.m("story.persist.failed.uploads", copyOnWriteArrayList);
    }

    @Override // xsna.tov
    public final int t(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((IPersistingStoryUpload) it.next()).d9());
        }
        Iterator it2 = arrayList2.iterator();
        int i = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            ((com.vk.upload.impl.b) next).d = ((int) System.currentTimeMillis()) + i;
            i = i2;
        }
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        azl0 azl0Var = new azl0(arrayList2, context.getString(R.string.story_sending), this.d);
        Context context2 = e43.a;
        if (context2 == null) {
            context2 = null;
        }
        com.vk.upload.impl.a.g(azl0Var, new UploadNotification.a(null, context2.getString(R.string.story_sent), null));
        int i3 = com.vk.upload.impl.a.i(azl0Var);
        this.c.put(Integer.valueOf(i3), arrayList);
        azl0Var.d = i3;
        return i3;
    }

    public final IPersistingStoryUpload u(int i) {
        IPersistingStoryUpload iPersistingStoryUpload;
        Object obj;
        IPersistingStoryUpload iPersistingStoryUpload2;
        Iterator<IPersistingStoryUpload> it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                iPersistingStoryUpload = null;
                break;
            }
            iPersistingStoryUpload = it.next();
            if (iPersistingStoryUpload.V7().a == i) {
                break;
            }
        }
        IPersistingStoryUpload iPersistingStoryUpload3 = iPersistingStoryUpload;
        if (iPersistingStoryUpload3 == null) {
            Iterator<IPersistingStoryUpload> it2 = this.b.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    iPersistingStoryUpload2 = null;
                    break;
                }
                iPersistingStoryUpload2 = it2.next();
                if (iPersistingStoryUpload2.V7().a == i) {
                    break;
                }
            }
            iPersistingStoryUpload3 = iPersistingStoryUpload2;
        }
        if (iPersistingStoryUpload3 == null) {
            Iterator<T> it3 = this.c.values().iterator();
            while (it3.hasNext()) {
                Iterator it4 = ((List) it3.next()).iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it4.next();
                    if (((IPersistingStoryUpload) obj).V7().a == i) {
                        break;
                    }
                }
                IPersistingStoryUpload iPersistingStoryUpload4 = (IPersistingStoryUpload) obj;
                if (iPersistingStoryUpload4 != null) {
                    return iPersistingStoryUpload4;
                }
            }
        }
        return iPersistingStoryUpload3;
    }

    public final IPersistingStoryUpload v(int i) {
        IPersistingStoryUpload iPersistingStoryUpload;
        Object obj;
        Iterator<IPersistingStoryUpload> it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                iPersistingStoryUpload = null;
                break;
            }
            iPersistingStoryUpload = it.next();
            if (iPersistingStoryUpload.V7().b == i) {
                break;
            }
        }
        IPersistingStoryUpload iPersistingStoryUpload2 = iPersistingStoryUpload;
        if (iPersistingStoryUpload2 == null) {
            Iterator<T> it2 = this.c.values().iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((List) it2.next()).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it3.next();
                    if (((IPersistingStoryUpload) obj).d9().d == i) {
                        break;
                    }
                }
                IPersistingStoryUpload iPersistingStoryUpload3 = (IPersistingStoryUpload) obj;
                if (iPersistingStoryUpload3 != null) {
                    return iPersistingStoryUpload3;
                }
            }
        }
        return iPersistingStoryUpload2;
    }
}
