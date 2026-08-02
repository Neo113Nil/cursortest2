package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraft;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftCommonData;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftMusicInfo;
import com.vk.dto.clips.model.ClipsEditorInputVideoItem;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: ClipsDraftsInteractor.kt */
/* loaded from: classes17.dex */
public final class lud {
    public final gyg0 a;
    public final qsd b;
    public final xke c;
    public volatile otd d;

    public lud(mtd mtdVar, xke xkeVar, qxn0 qxn0Var) {
        Context context = e43.a;
        gyg0 gyg0Var = new gyg0(xkeVar, context == null ? null : context, qxn0Var);
        qsd qsdVar = new qsd(mtdVar, xkeVar);
        this.a = gyg0Var;
        this.b = qsdVar;
        this.c = xkeVar;
    }

    public final ClipsDraft a(String str) {
        try {
            ClipsDraft.a aVar = ClipsDraft.d;
            JSONObject jSONObject = new JSONObject(str);
            aVar.getClass();
            return new ClipsDraft(jSONObject);
        } catch (Throwable th) {
            this.c.c(th);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x025d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final otd b(otd otdVar) {
        int i;
        boolean z;
        boolean z2;
        List<? extends List<ClipsDraftMusicInfo>> list;
        boolean z3;
        boolean z4;
        boolean z5;
        Iterator<? extends List<ClipsDraftMusicInfo>> it;
        String str;
        boolean z6;
        String str2;
        String absolutePath;
        File file;
        Uri g;
        String path;
        qsd qsdVar = this.b;
        qsdVar.getClass();
        ptd ptdVar = otdVar.a;
        List<cud> list2 = ptdVar.c;
        boolean isEmpty = list2.isEmpty();
        gyg0 gyg0Var = this.a;
        String str3 = null;
        if (!isEmpty) {
            List<cud> list3 = list2;
            if ((list3 instanceof Collection) && list3.isEmpty()) {
                i = 0;
            } else {
                Iterator<T> it2 = list3.iterator();
                i = 0;
                while (it2.hasNext()) {
                    if (vhk0.g(((cud) it2.next()).a) && (i = i + 1) < 0) {
                        e43.s();
                        throw null;
                    }
                }
            }
            if (i == list2.size()) {
                ClipsDraft D = q6x.D(otdVar);
                ClipsDraftCommonData clipsDraftCommonData = D.b;
                mtd mtdVar = qsdVar.a;
                File b = mtdVar.a().b();
                String str4 = clipsDraftCommonData.j;
                File file2 = (str4 == null || (g = jeq0.g(str4)) == null || (path = g.getPath()) == null) ? null : new File(path);
                if (file2 != null) {
                    File parentFile = file2.getParentFile();
                    if (!epx.f(parentFile != null ? parentFile.getAbsolutePath() : null, b.getAbsolutePath())) {
                        File c = qsd.c(file2, b);
                        File b2 = c != null ? c : qsd.b(qsdVar, file2, b);
                        clipsDraftCommonData.j = b2 != null ? Uri.fromFile(b2).toString() : null;
                        if (c == null || !epx.f(c.getAbsolutePath(), file2.getAbsolutePath())) {
                            z = true;
                            File c2 = mtdVar.a().c();
                            ArrayList arrayList = new ArrayList();
                            z2 = false;
                            for (ClipsEditorInputVideoItem clipsEditorInputVideoItem : clipsDraftCommonData.d) {
                                String str5 = str3;
                                File file3 = clipsEditorInputVideoItem.b;
                                File parentFile2 = file3.getParentFile();
                                if (!epx.f(parentFile2 != null ? parentFile2.getAbsolutePath() : str5, c2.getAbsolutePath())) {
                                    File c3 = qsd.c(file3, c2);
                                    if (c3 != null) {
                                        file = c3;
                                        z2 = true;
                                    } else {
                                        File b3 = qsd.b(qsdVar, file3, c2);
                                        if (b3 != null) {
                                            z2 = true;
                                        }
                                        if (b3 != null) {
                                            file = b3;
                                        }
                                    }
                                    arrayList.add(new ClipsEditorInputVideoItem(file, clipsEditorInputVideoItem.c, clipsEditorInputVideoItem.d, clipsEditorInputVideoItem.e, clipsEditorInputVideoItem.f, clipsEditorInputVideoItem.g, clipsEditorInputVideoItem.h, clipsEditorInputVideoItem.i, clipsEditorInputVideoItem.j, clipsEditorInputVideoItem.k, clipsEditorInputVideoItem.l, clipsEditorInputVideoItem.m, clipsEditorInputVideoItem.n, clipsEditorInputVideoItem.o, clipsEditorInputVideoItem.p, clipsEditorInputVideoItem.q, clipsEditorInputVideoItem.r));
                                    str3 = str5;
                                }
                                file = file3;
                                arrayList.add(new ClipsEditorInputVideoItem(file, clipsEditorInputVideoItem.c, clipsEditorInputVideoItem.d, clipsEditorInputVideoItem.e, clipsEditorInputVideoItem.f, clipsEditorInputVideoItem.g, clipsEditorInputVideoItem.h, clipsEditorInputVideoItem.i, clipsEditorInputVideoItem.j, clipsEditorInputVideoItem.k, clipsEditorInputVideoItem.l, clipsEditorInputVideoItem.m, clipsEditorInputVideoItem.n, clipsEditorInputVideoItem.o, clipsEditorInputVideoItem.p, clipsEditorInputVideoItem.q, clipsEditorInputVideoItem.r));
                                str3 = str5;
                            }
                            String str6 = str3;
                            if (z2) {
                                clipsDraftCommonData.d = arrayList;
                            }
                            boolean z7 = z | z2;
                            list = clipsDraftCommonData.l;
                            if (list != null) {
                                z4 = z7;
                                z3 = false;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                Iterator<? extends List<ClipsDraftMusicInfo>> it3 = list.iterator();
                                z3 = false;
                                while (it3.hasNext()) {
                                    List<ClipsDraftMusicInfo> next = it3.next();
                                    ArrayList arrayList3 = new ArrayList();
                                    for (ClipsDraftMusicInfo clipsDraftMusicInfo : next) {
                                        File a = mtdVar.a().a();
                                        ClipsEditorMusicInfo clipsEditorMusicInfo = clipsDraftMusicInfo.b;
                                        String str7 = clipsEditorMusicInfo.g;
                                        if (str7 != null) {
                                            boolean z8 = (clipsEditorMusicInfo.l || clipsEditorMusicInfo.j) ? false : true;
                                            z5 = z7;
                                            File file4 = new File(str7);
                                            File parentFile3 = file4.getParentFile();
                                            if (parentFile3 != null) {
                                                it = it3;
                                                str2 = parentFile3.getAbsolutePath();
                                            } else {
                                                it = it3;
                                                str2 = str6;
                                            }
                                            if (z8 || epx.f(str2, a.getAbsolutePath())) {
                                                z6 = false;
                                            } else {
                                                File c4 = qsd.c(file4, a);
                                                if (c4 != null) {
                                                    str7 = c4.getAbsolutePath();
                                                    z6 = true;
                                                } else {
                                                    File b4 = qsd.b(qsdVar, file4, a);
                                                    z6 = b4 != null;
                                                    if (b4 != null && (absolutePath = b4.getAbsolutePath()) != null) {
                                                        str7 = absolutePath;
                                                    }
                                                }
                                            }
                                            str = str7;
                                        } else {
                                            z5 = z7;
                                            it = it3;
                                            str = str6;
                                            z6 = false;
                                        }
                                        arrayList3.add(new ClipsDraftMusicInfo(ClipsEditorMusicInfo.zb(clipsEditorMusicInfo, null, null, 0, 0, 0, str, 0, 2015), clipsDraftMusicInfo.c, clipsDraftMusicInfo.d, clipsDraftMusicInfo.e));
                                        z3 |= z6;
                                        z7 = z5;
                                        it3 = it;
                                    }
                                    arrayList2.add(arrayList3);
                                }
                                z4 = z7;
                                if (z3) {
                                    clipsDraftCommonData.l = arrayList2;
                                }
                            }
                            if (z4 || z3) {
                                return otdVar;
                            }
                            gyg0Var.q(D.e5().toString(), clipsDraftCommonData.b, false);
                            return vua0.D(D);
                        }
                    }
                }
                z = false;
                File c22 = mtdVar.a().c();
                ArrayList arrayList4 = new ArrayList();
                z2 = false;
                while (r13.hasNext()) {
                }
                String str62 = str3;
                if (z2) {
                }
                boolean z72 = z | z2;
                list = clipsDraftCommonData.l;
                if (list != null) {
                }
                if (!(z4 | z3)) {
                }
            }
        }
        String str8 = ptdVar.a;
        gyg0Var.getWritableDatabase().delete(gyg0Var.p(), "id = ?", new String[]{str8});
        gyg0Var.d.f(new gdo(str8));
        return null;
    }
}
