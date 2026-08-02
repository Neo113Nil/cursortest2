package xsna;

import android.content.res.AssetManager;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.VideoUrlStorage;
import com.vk.dto.common.im.ImageList;
import com.vk.media.MediaUtils;
import com.vkontakte.android.attachments.VideoAttachment;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;

/* compiled from: TaskInvalidateEntityViaNetwork.java */
/* loaded from: classes2.dex */
public final class g6o0 implements io.reactivex.rxjava3.functions.b, ti20, bpr, g530, pjw {
    public final Object b;

    public /* synthetic */ g6o0(Object obj) {
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.g530
    public void H2() {
        pid0 pid0Var = (pid0) this.b;
        tmc tmcVar = pid0Var.n;
        if (tmcVar != null) {
            ((uid0) pid0Var.l.getValue()).a(pid0Var.m, tmcVar, pid0Var.o, new nk0(22, pid0Var, tmcVar));
        }
    }

    @Override // xsna.bpr
    public ArrayList a(ArrayList arrayList, qor qorVar) {
        pbq pbqVar = (pbq) this.b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            ce6 u = pbqVar.u(pbqVar.r(intValue), qorVar);
            if (u != null) {
                pbqVar.t(u, intValue);
                arrayList2.add(new Pair((View) u.b, Integer.valueOf(intValue)));
            }
        }
        return arrayList2;
    }

    @Override // io.reactivex.rxjava3.functions.b
    public void accept(Object obj, Object obj2) throws Throwable {
        Throwable th = (Throwable) obj2;
        com.vk.im.ui.components.dialogs_list.j jVar = (com.vk.im.ui.components.dialogs_list.j) this.b;
        if (th == null) {
            jVar.h(Boolean.TRUE);
        } else {
            jVar.g(th);
        }
    }

    @Override // xsna.bpr
    public ArrayList b(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        pbq pbqVar = (pbq) this.b;
        int q = pbqVar.q();
        for (int i = 0; i < q; i++) {
            ce6 u = pbqVar.u(pbqVar.r(i), viewGroup);
            if (u != null) {
                pbqVar.t(u, i);
                arrayList.add(new Pair((View) u.b, Integer.valueOf(i)));
            }
        }
        return arrayList;
    }

    @Override // xsna.bpr
    public bac c(int i) {
        d6y0 d6y0Var = new d6y0();
        pbq pbqVar = (pbq) this.b;
        Attachment attachment = (Attachment) j5g.b0(i, pbqVar.h);
        if (attachment != null) {
            if (attachment instanceof VideoAttachment) {
                VideoAttachment videoAttachment = (VideoAttachment) attachment;
                VideoUrlStorage w9 = videoAttachment.k.w9();
                VideoUrl videoUrl = VideoUrl.EXTERNAL_URL;
                if (w9.Ab(videoUrl) == null) {
                    pbq.s(attachment, d6y0Var);
                } else if (((Boolean) pbqVar.i.invoke()).booleanValue()) {
                    int width = videoAttachment.getWidth();
                    int height = videoAttachment.getHeight();
                    if (pbqVar.q() == 1) {
                        int i2 = iah0.f().widthPixels;
                        d6y0Var.a = i2;
                        d6y0Var.b = (i2 / 16) * 9;
                    } else {
                        if (width <= 0) {
                            width = jnw.e;
                        }
                        d6y0Var.a = width;
                        if (height <= 0) {
                            height = jnw.f;
                        }
                        d6y0Var.b = height;
                    }
                } else {
                    String Ab = videoAttachment.k.w9().Ab(videoUrl);
                    if (Ab != null) {
                        MediaUtils.f fVar = null;
                        if (videoAttachment.k.H6()) {
                            int intValue = videoAttachment.getId().intValue();
                            SparseArray<MediaUtils.f> sparseArray = pbqVar.p;
                            MediaUtils.f fVar2 = sparseArray.get(intValue);
                            if (fVar2 != null) {
                                fVar = fVar2;
                            } else {
                                MediaUtils.f d = MediaUtils.a.d(Ab);
                                if (d != null) {
                                    sparseArray.put(intValue, d);
                                    fVar = d;
                                }
                            }
                        }
                        d6y0Var.a = fVar != null ? fVar.a : videoAttachment.getWidth();
                        d6y0Var.b = fVar != null ? fVar.b : videoAttachment.getHeight();
                    }
                }
            } else {
                pbq.s(attachment, d6y0Var);
            }
        }
        return new bac(d6y0Var.a, d6y0Var.b);
    }

    @Override // xsna.ti20
    public InputStream d(String str) {
        try {
            return ((AssetManager) this.b).open(str.substring(1));
        } catch (IOException unused) {
            return null;
        }
    }

    public io.reactivex.rxjava3.core.a e(VideoFile videoFile) {
        io.reactivex.rxjava3.core.a invoke;
        izs<? super VideoFile, ? extends io.reactivex.rxjava3.core.a> izsVar = ((y8e) this.b).l;
        return (izsVar == null || (invoke = izsVar.invoke(videoFile)) == null) ? io.reactivex.rxjava3.internal.operators.completable.i.b : invoke;
    }

    @Override // xsna.pjw
    public String f(int i) {
        return ImageList.Eb(i, i, ((ImageList) this.b).b);
    }

    public void g(VideoFile videoFile) {
        y8e y8eVar = (y8e) this.b;
        izs<? super VideoFile, s3q0> izsVar = y8eVar.e;
        if (izsVar != null) {
            izsVar.invoke(videoFile);
            return;
        }
        wmf wmfVar = y8eVar.c;
        if (wmfVar != null) {
            wmfVar.uc(videoFile);
        }
    }

    public g6o0(a6g a6gVar, c8g c8gVar, n7g n7gVar, hjp0 hjp0Var) {
        this.b = (a6gVar == a6g.Depth10 && n7gVar == n7g.BT2020 && (hjp0Var == hjp0.PQ || hjp0Var == hjp0.HLG) && c8gVar == c8g.BT2020NC) ? svu.a(hjp0Var) : null;
    }

    @Override // xsna.g530
    public void g3() {
    }
}
