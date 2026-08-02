package xsna;

import android.content.Context;
import android.util.SparseArray;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.upload.api.VideoUpload;
import com.vk.libvideo.upload.api.VideoUploadEvent;
import com.vk.lists.ListDataSet;
import com.vk.newsfeed.api.data.NewsComment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class g21 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g21(Object obj, int i, Object obj2, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
        this.e = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        sd90 sd90Var;
        switch (this.b) {
            case 0:
                s21.t((Context) this.d, this.c, (String) this.e);
                break;
            case 1:
                mdg mdgVar = (mdg) this.d;
                iag iagVar = (iag) this.e;
                ListDataSet<cbg> listDataSet = mdgVar.K;
                ?? r2 = mdgVar.e;
                int size = listDataSet.d.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        cbg c = listDataSet.c(i);
                        if (c != null) {
                            NewsComment newsComment = (NewsComment) c.a;
                            if (newsComment.i == this.c) {
                                newsComment.u = true;
                                newsComment.e = iagVar.N1();
                                mdgVar.L7(newsComment);
                                r2.bm(newsComment.i);
                                r2.Rb(i);
                            }
                        }
                        i++;
                    }
                }
                if (!mdgVar.x7() && (sd90Var = mdgVar.Q) != null) {
                    sd90Var.g();
                }
                mdgVar.N7(iagVar);
                break;
            default:
                com.vk.libvideo.upload.impl.b bVar = (com.vk.libvideo.upload.impl.b) this.d;
                VideoUpload videoUpload = (VideoUpload) this.e;
                VideoFile videoFile = (VideoFile) obj;
                SparseArray<VideoUploadEvent.Progress> sparseArray = bVar.c;
                int i2 = this.c;
                sparseArray.remove(i2);
                VideoUpload zb = VideoUpload.zb(videoUpload, null, null, false, false, false, null, videoFile, 63231);
                bVar.d.put(i2, zb);
                bVar.g.a(new VideoUploadEvent.Done(zb, videoFile));
                wjs0.a(new fyr0(videoFile));
                break;
        }
        return s3q0.a;
    }
}
