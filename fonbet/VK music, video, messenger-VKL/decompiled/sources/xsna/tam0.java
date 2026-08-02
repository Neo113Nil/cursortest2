package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.vk.core.serialize.Serializer;
import com.vk.dto.stories.entities.StoryImSharingStats;
import com.vk.dto.stories.entities.stat.BackgroundInfo;
import com.vk.log.L;
import com.vk.media.MediaUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;

/* compiled from: StoryRawData.kt */
/* loaded from: classes3.dex */
public final class tam0 {
    public static final a x = new a();
    public final yaa0 a;
    public List<mat0> b;
    public final boolean c;
    public BackgroundInfo d;
    public final List<String> e;
    public final boolean f;
    public final boolean g;
    public final zcl0 h;
    public final wlo i;
    public vlo j;
    public t8l0 k;
    public final String l;
    public final boolean m;
    public final yaa0 n;
    public final yaa0 o;
    public final Uri p;
    public final boolean q;
    public final String r;
    public final StoryImSharingStats s;
    public Bitmap t;
    public Bitmap u;
    public txl0 v;
    public float w;

    /* compiled from: StoryRawData.kt */
    public static final class a {
        public static ArrayList a(File file, boolean z, String str, boolean z2, boolean z3, int i) {
            a aVar = tam0.x;
            String str2 = (i & 4) != 0 ? null : str;
            boolean z4 = (i & 8) != 0 ? false : z2;
            boolean z5 = (i & 16) != 0 ? false : z3;
            boolean z6 = (i & 32) == 0;
            List<mat0> f = f(aVar, file, false, 2);
            ArrayList arrayList = new ArrayList(c5g.u(f, 10));
            for (mat0 mat0Var : f) {
                long j = mat0Var.c;
                long j2 = mat0Var.d;
                File file2 = mat0Var.a;
                ArrayList o = e43.o(new mat0(file2, mat0Var.b, j, j2, mat0Var.e, mat0Var.f, z6, epx.f(file2, file2) ? mat0Var.j : null));
                Serializer.c<BackgroundInfo> cVar = BackgroundInfo.CREATOR;
                arrayList.add(new tam0(null, o, true, BackgroundInfo.a.a(), null, z, z4, null, null, null, null, str2, z5, null, null, null, false, null, null, 518032));
            }
            return arrayList;
        }

        public static tam0 b(boolean z, BackgroundInfo backgroundInfo, Uri uri, boolean z2, int i) {
            return new tam0(null, new ArrayList(), z, backgroundInfo, null, false, true, null, null, null, null, null, false, null, null, (i & 8) != 0 ? null : uri, (i & 16) != 0 ? false : z2, null, null, 425872);
        }

        public static tam0 c(Uri uri, boolean z, boolean z2, boolean z3, boolean z4, StoryImSharingStats storyImSharingStats, int i) {
            boolean z5 = (i & 2) != 0 ? false : z;
            boolean z6 = (i & 4) != 0 ? true : z2;
            boolean z7 = (i & 8) != 0 ? false : z3;
            boolean z8 = (i & 16) != 0 ? false : z4;
            StoryImSharingStats storyImSharingStats2 = (i & 32) != 0 ? null : storyImSharingStats;
            yaa0 yaa0Var = new yaa0(uri);
            ArrayList arrayList = new ArrayList();
            Serializer.c<BackgroundInfo> cVar = BackgroundInfo.CREATOR;
            return new tam0(yaa0Var, arrayList, false, BackgroundInfo.a.a(), null, z5, z7, null, null, null, null, null, z6, null, null, null, z8, null, storyImSharingStats2, 192400);
        }

        public static String e(Context context, Uri uri) {
            File u = com.vk.core.files.a.u();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(u);
                try {
                    InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                    if (openInputStream != null) {
                        try {
                            i7o0.b(openInputStream, fileOutputStream, 8192);
                        } finally {
                        }
                    }
                    ro.e(openInputStream, null);
                    fileOutputStream.close();
                    return u.getPath();
                } finally {
                }
            } catch (Exception e) {
                L.i(e);
                return "";
            }
        }

        public static List f(a aVar, File file, boolean z, int i) {
            ListBuilder listBuilder;
            long j;
            long j2;
            long j3;
            boolean z2 = (i & 2) != 0 ? false : z;
            MediaUtils.f d = MediaUtils.a.d(file.getPath());
            if (d == null) {
                return EmptyList.b;
            }
            long j4 = d.f;
            long j5 = 60000;
            boolean z3 = false;
            if (j4 <= 60000) {
                return Collections.singletonList(new mat0(file, z3, 0L, 0L, false, null, 496));
            }
            long j6 = j4 / 60000;
            long j7 = j4 - (j6 * 60000);
            ListBuilder listBuilder2 = new ListBuilder(((int) j6) + 2);
            long j8 = 1;
            if (1 <= j6) {
                long j9 = 1;
                while (true) {
                    long j10 = (j9 - j8) * j5;
                    long j11 = j8;
                    long j12 = j10 + j5;
                    if (j9 < j6) {
                        j = j6;
                        listBuilder = listBuilder2;
                        j2 = j11;
                        listBuilder.add(new mat0(file, z3, j10, j12, z2, null, 480));
                        j3 = j4;
                    } else {
                        j = j6;
                        listBuilder = listBuilder2;
                        j2 = j11;
                        if (j7 > TimeUnit.SECONDS.toMillis(j2)) {
                            MediaUtils.f fVar = null;
                            int i2 = 480;
                            listBuilder.add(new mat0(file, z3, j10, j12, z2, fVar, i2));
                            j3 = j4;
                            listBuilder.add(new mat0(file, z3, j12, j3, z2, fVar, i2));
                        } else {
                            j3 = j4;
                            listBuilder.add(new mat0(file, z3, j10, j3, z2, null, 480));
                        }
                    }
                    if (j9 == j6) {
                        break;
                    }
                    j9 += j2;
                    listBuilder2 = listBuilder;
                    j4 = j3;
                    j8 = j2;
                    j6 = j;
                    j5 = 60000;
                }
            } else {
                listBuilder = listBuilder2;
            }
            return listBuilder.g();
        }

        public final ArrayList d(File file, boolean z, boolean z2, boolean z3) {
            List f = f(this, file, z, 4);
            ArrayList arrayList = new ArrayList(c5g.u(f, 10));
            Iterator it = f.iterator();
            while (it.hasNext()) {
                ArrayList o = e43.o((mat0) it.next());
                Serializer.c<BackgroundInfo> cVar = BackgroundInfo.CREATOR;
                arrayList.add(new tam0(null, o, false, BackgroundInfo.a.a(), null, false, false, null, null, null, null, null, z2, null, null, null, z3, null, null, 454640));
            }
            return arrayList;
        }
    }

    public tam0(yaa0 yaa0Var, List<mat0> list, boolean z, BackgroundInfo backgroundInfo, List<String> list2, boolean z2, boolean z3, zcl0 zcl0Var, wlo wloVar, vlo vloVar, t8l0 t8l0Var, String str, boolean z4, yaa0 yaa0Var2, yaa0 yaa0Var3, Uri uri, boolean z5, String str2, StoryImSharingStats storyImSharingStats) {
        this.a = yaa0Var;
        this.b = list;
        this.c = z;
        this.d = backgroundInfo;
        this.e = list2;
        this.f = z2;
        this.g = z3;
        this.h = zcl0Var;
        this.i = wloVar;
        this.j = vloVar;
        this.k = t8l0Var;
        this.l = str;
        this.m = z4;
        this.n = yaa0Var2;
        this.o = yaa0Var3;
        this.p = uri;
        this.q = z5;
        this.r = str2;
        this.s = storyImSharingStats;
        this.w = 1.0f;
    }

    public final boolean a() {
        return (this.a == null && d() == null) ? false : true;
    }

    public final boolean b() {
        nov novVar;
        CopyOnWriteArrayList<nov> copyOnWriteArrayList = this.h.a;
        int i = 0;
        while (true) {
            if (i == copyOnWriteArrayList.size()) {
                novVar = null;
                break;
            }
            if (copyOnWriteArrayList.get(i) instanceof upe0) {
                novVar = copyOnWriteArrayList.get(i);
                break;
            }
            i++;
        }
        return ((upe0) novVar) != null;
    }

    public final boolean c() {
        int i;
        zcl0 zcl0Var = this.h;
        CopyOnWriteArrayList<nov> copyOnWriteArrayList = zcl0Var.a;
        if (copyOnWriteArrayList.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = copyOnWriteArrayList.iterator();
            i = 0;
            while (it.hasNext()) {
                if ((((nov) it.next()) instanceof grt0) && (i = i + 1) < 0) {
                    e43.s();
                    throw null;
                }
            }
        }
        return i == 1 && zcl0Var.p();
    }

    public final mat0 d() {
        return (mat0) j5g.a0(this.b);
    }

    public final boolean e() {
        mat0 d = d();
        return d == null || Math.min(d.c(), d.b()) >= 1080;
    }

    public final boolean f() {
        return this.a != null;
    }

    public final boolean g() {
        return d() != null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryRawData(durationMs=");
        Iterator<T> it = this.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((mat0) it.next()).a();
        }
        return vu5.b(sb, i, ')');
    }

    public /* synthetic */ tam0(yaa0 yaa0Var, List list, boolean z, BackgroundInfo backgroundInfo, List list2, boolean z2, boolean z3, zcl0 zcl0Var, wlo wloVar, vlo vloVar, t8l0 t8l0Var, String str, boolean z4, yaa0 yaa0Var2, yaa0 yaa0Var3, Uri uri, boolean z5, String str2, StoryImSharingStats storyImSharingStats, int i) {
        this(yaa0Var, list, z, (i & 8) != 0 ? null : backgroundInfo, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? new zcl0() : zcl0Var, (i & 256) != 0 ? new wlo() : wloVar, (i & 512) != 0 ? new vlo((kif0) null, 3) : vloVar, (i & 1024) != 0 ? null : t8l0Var, (i & 2048) != 0 ? null : str, (i & 4096) != 0 ? true : z4, (i & 8192) != 0 ? null : yaa0Var2, (i & 16384) != 0 ? null : yaa0Var3, (32768 & i) != 0 ? null : uri, (65536 & i) != 0 ? false : z5, (131072 & i) != 0 ? null : str2, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : storyImSharingStats);
    }
}
