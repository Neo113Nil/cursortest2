package xsna;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.util.Size;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.google.android.gms.internal.measurement.zzox;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.util.measure.ScaleType;
import com.vk.dto.music.MusicTrack;
import com.vk.im.engine.models.dialogs.ChatPermissions;
import com.vk.im.ui.components.chat_controls.ChatControls;
import com.vk.imageloader.fresco.Quality;
import com.vk.log.L;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.Pair;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.p4p;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
@vby
/* loaded from: classes13.dex */
public final class kq01 implements kwn, d0v, q701, h5p, sj0 {
    public static gpf b;
    public static final jai c = new jai(1041574466, new rce(3), false);
    public static final jai d = new jai(-100590188, new hci(1), false);
    public static final kq01 e = new kq01();
    public static final kq01 f = new kq01();
    public static final kq01 g = new kq01();
    public static final /* synthetic */ kq01 h = new kq01();

    public static String b(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b2)));
        }
        return sb.toString();
    }

    public static final String c(String str) {
        String k0 = drm0.k0(str, "(", str);
        return drm0.m0(JwtParser.SEPARATOR_CHAR, k0, k0);
    }

    public static final String d(tlo0 tlo0Var, androidx.compose.runtime.a aVar) {
        CharSequence b2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-2117210913, 0, -1, "com.vk.core.compose.ext.asString (TextSourceExt.kt:14)");
        }
        aVar.r(AndroidCompositionLocals_androidKt.a);
        if (tlo0Var == null) {
            aVar.K(2059566778);
            aVar.j();
            b2 = null;
        } else {
            aVar.K(1174816295);
            b2 = tlo0Var.b(((Context) aVar.r(AndroidCompositionLocals_androidKt.b)).getResources());
            aVar.j();
        }
        String obj = b2 != null ? b2.toString() : null;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return obj;
    }

    public static final String g(tlo0 tlo0Var, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-861852013, 0, -1, "com.vk.core.compose.ext.asStringOrEmpty (TextSourceExt.kt:10)");
        }
        String d2 = d(tlo0Var, aVar);
        if (d2 == null) {
            d2 = "";
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return d2;
    }

    public static final void h(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS original_tracks_order (mid text NOT NULL, uuid text NOT NULL, access_key text, track_code text, launch_meta text NOT NULL, user_id INTEGER NOT NULL, COL_QUEUE_TYPE INTEGER NOT NULL DEFAULT 0, PRIMARY KEY (mid, COL_QUEUE_TYPE))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS actual_tracks_order (mid text NOT NULL, uuid text NOT NULL, access_key text, track_code text, launch_meta text NOT NULL, user_id INTEGER NOT NULL, COL_QUEUE_TYPE INTEGER NOT NULL DEFAULT 0, PRIMARY KEY (mid, COL_QUEUE_TYPE))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS current_track (uuid text NOT NULL, position INTEGER NOT NULL, progress_ms INTEGER NOT NULL, music_track text NOT NULL, launch_meta text NOT NULL, user_id INTEGER NOT NULL, COL_QUEUE_TYPE INTEGER NOT NULL DEFAULT 0, PRIMARY KEY (uuid, COL_QUEUE_TYPE))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS cached_tracks (mid text NOT NULL, music_track text NOT NULL, launch_meta text NOT NULL, user_id INTEGER NOT NULL, COL_QUEUE_TYPE INTEGER NOT NULL DEFAULT 0, PRIMARY KEY (mid, COL_QUEUE_TYPE))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS play_source (user_id INTEGER NOT NULL, play_source text, launch_meta text NOT NULL, COL_QUEUE_TYPE INTEGER NOT NULL DEFAULT 0, PRIMARY KEY (user_id, COL_QUEUE_TYPE))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS analytics_listening_time (timestamp_ms INTEGER PRIMARY KEY NOT NULL, mid text NOT NULL, user_id INTEGER NOT NULL, playable text NOT NULL, stream_duration_ms INTEGER NOT NULL, listening_time_ms INTEGER NOT NULL, is_final INTEGER NOT NULL, launch_meta text NOT NULL)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS audiobook_chapter_progress (chapter_id text NOT NULL, progress_ms INTEGER NOT NULL, launch_origin text NOT NULL, user_id INTEGER NOT NULL, PRIMARY KEY (chapter_id, user_id))");
    }

    public static final int i(String str) {
        String w0 = erm0.w0(1, str);
        int length = w0.length();
        int i = 2;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (w0.charAt(i3) == '1') {
                i2 = l(i) + i2;
            }
            i++;
        }
        return i2;
    }

    public static final boolean j(List list, List list2, wzs wzsVar) {
        if (list.size() == list2.size()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((Boolean) wzsVar.invoke(list.get(i), list2.get(i))).booleanValue()) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0055, code lost:
    
        if (r8 == 0) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final fxj0 k(List list, int i, double d2, boolean z) {
        ?? r8;
        fxj0 fxj0Var;
        fxj0 fxj0Var2 = null;
        if (list == null) {
            return null;
        }
        List list2 = list;
        fxj0 o = ixj0.o(list2);
        if (o != null) {
            if (o.c7()) {
                ArrayList l = ixj0.l(o.getWidth(), o.getWidth());
                r8 = new ArrayList(c5g.u(l, 10));
                Iterator it = l.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    r8.add(o.kb(intValue, o.H8(intValue), o.X7(intValue)));
                }
            } else {
                r8 = 0;
            }
        }
        r8 = list2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : r8) {
            if (mcr0.p(((fxj0) obj).getUrl())) {
                arrayList.add(obj);
            }
        }
        fxj0 b2 = ixj0.b(arrayList);
        if (b2 != null && z) {
            return b2;
        }
        if (d2 <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            fxj0Var = ixj0.m(list2);
        } else {
            fxj0 o2 = ixj0.o(list2);
            if (o2 == null) {
                fxj0Var2 = null;
            } else if (o2.c7()) {
                int i2 = (int) (i * d2);
                int[] iArr = ixj0.a;
                int i3 = iArr[ixj0.a(i2, i, iArr)];
                int H8 = o2.H8(i3);
                StringBuilder sb = new StringBuilder("base: target = ");
                sb.append(i);
                sb.append(", suppression = ");
                sb.append(d2);
                dgn.a(i2, i3, ", suppressed = ", ", selected = ", sb);
                sb.append('x');
                sb.append(H8);
                L.e("SuppressedQuality", sb.toString());
                fxj0Var2 = o2.kb(i3, H8, o2.X7(i3));
            }
            if (fxj0Var2 == null) {
                List D0 = j5g.D0(new hxj0(new gxj0(0)), j5g.O0(list2));
                if (D0.isEmpty()) {
                    fxj0Var2 = null;
                } else {
                    int i4 = (int) (i * d2);
                    List list3 = D0;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(Integer.valueOf(((fxj0) it2.next()).getWidth()));
                    }
                    fxj0Var2 = (fxj0) D0.get(ixj0.a(i4, i, j5g.N0(arrayList2)));
                    StringBuilder sb2 = new StringBuilder("non-base: ");
                    nyh0.a(i, j5g.g0(list3, null, null, null, 0, new c220(20), 31), ", target = ", ", suppression = ", sb2);
                    sb2.append(d2);
                    sb2.append(", suppressed = ");
                    sb2.append(i4);
                    sb2.append(", selected = ");
                    sb2.append(fxj0Var2.getWidth());
                    sb2.append('x');
                    sb2.append(fxj0Var2.getHeight());
                    L.e("SuppressedQuality", sb2.toString());
                }
            }
            fxj0Var = fxj0Var2;
        }
        return (b2 != null && (fxj0Var == null || b2.getWidth() >= fxj0Var.getWidth())) ? b2 : fxj0Var;
    }

    public static final int l(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1 || i == 2) {
            return 1;
        }
        return l(i - 2) + l(i - 1);
    }

    public static final Pair m(List list) {
        Object obj;
        if (list != null) {
            List list2 = list;
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (uiw.a(((fxj0) obj).getUrl())) {
                    break;
                }
            }
            fxj0 fxj0Var = (fxj0) obj;
            if (fxj0Var == null) {
                fxj0Var = ixj0.m(list2);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                fxj0 fxj0Var2 = (fxj0) obj2;
                if (!fxj0Var2.c7() && mcr0.p(fxj0Var2.getUrl())) {
                    arrayList.add(obj2);
                }
            }
            fxj0 b2 = ixj0.b(arrayList);
            Quality quality = !epx.f(b2, fxj0Var) ? Quality.SUITABLE : Quality.LOWEST;
            if (b2 != null) {
                return new Pair(b2, quality);
            }
            if (fxj0Var != null) {
                return new Pair(fxj0Var, null);
            }
        }
        return null;
    }

    public static en40 n(kq01 kq01Var, MusicTrack musicTrack, int i) {
        kq01Var.getClass();
        String str = musicTrack.y;
        return new en40(Integer.valueOf(musicTrack.b), null, Integer.valueOf(i), Long.valueOf(musicTrack.c.b), null, str);
    }

    public static final k9x o(Matcher matcher, int i) {
        if (!matcher.find()) {
            k9x k9xVar = k9x.e;
            return k9x.e;
        }
        String group = matcher.group(4);
        if (group != null) {
            int i2 = i(erm0.v0(1, group)) + i;
            return new k9x(i2, i2, 1);
        }
        String group2 = matcher.group(2);
        String group3 = matcher.group(3);
        if (group2 == null || group3 == null) {
            k9x k9xVar2 = k9x.e;
            return k9x.e;
        }
        int i3 = i(erm0.v0(1, group2)) + i;
        return new k9x(i3, i(group3) + i3, 1);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public static final com.vk.im.ui.components.chat_controls.ChatControls p(com.vk.im.engine.models.dialogs.ChatSettings r17) {
        /*
            r0 = r17
            com.vk.im.ui.components.chat_controls.ChatControls r1 = new com.vk.im.ui.components.chat_controls.ChatControls
            com.vk.im.engine.models.dialogs.ChatPermissions r2 = r0.B
            r3 = 0
            if (r2 == 0) goto Lc
            java.lang.String r4 = r2.b
            goto Ld
        Lc:
            r4 = r3
        Ld:
            if (r2 == 0) goto L12
            java.lang.String r5 = r2.c
            goto L13
        L12:
            r5 = r3
        L13:
            if (r2 == 0) goto L18
            java.lang.String r6 = r2.d
            goto L19
        L18:
            r6 = r3
        L19:
            if (r2 == 0) goto L1e
            java.lang.String r7 = r2.e
            goto L1f
        L1e:
            r7 = r3
        L1f:
            if (r2 == 0) goto L24
            java.lang.String r8 = r2.f
            goto L25
        L24:
            r8 = r3
        L25:
            if (r2 == 0) goto L2a
            java.lang.String r9 = r2.g
            goto L2b
        L2a:
            r9 = r3
        L2b:
            if (r2 == 0) goto L30
            java.lang.String r10 = r2.h
            goto L31
        L30:
            r10 = r3
        L31:
            if (r2 == 0) goto L36
            java.lang.String r2 = r2.i
            goto L37
        L36:
            r2 = r3
        L37:
            boolean r11 = r0.x
            if (r11 == 0) goto L42
            boolean r11 = r0.k
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            goto L43
        L42:
            r11 = r3
        L43:
            boolean r12 = r0.L
            java.lang.String r13 = "enabled"
            java.lang.String r14 = "disabled"
            if (r12 == 0) goto L51
            r12 = r1
            r1 = r4
            r4 = r7
            r7 = r10
            r10 = r14
            goto L56
        L51:
            r12 = r1
            r1 = r4
            r4 = r7
            r7 = r10
            r10 = r13
        L56:
            boolean r15 = r0.z
            if (r15 == 0) goto L65
            boolean r15 = r0.M
            r3 = r6
            r6 = r9
            r9 = r11
            if (r15 == 0) goto L63
            r11 = r14
            goto L6c
        L63:
            r11 = r13
            goto L6c
        L65:
            r16 = r11
            r11 = r3
            r3 = r6
            r6 = r9
            r9 = r16
        L6c:
            boolean r15 = r0.O
            if (r15 == 0) goto L82
            boolean r0 = r0.N
            if (r0 == 0) goto L7b
            r0 = r8
            r8 = r2
            r2 = r5
            r5 = r0
            r0 = r12
            r12 = r14
            goto L88
        L7b:
            r0 = r8
            r8 = r2
            r2 = r5
            r5 = r0
            r0 = r12
            r12 = r13
            goto L88
        L82:
            r0 = r8
            r8 = r2
            r2 = r5
            r5 = r0
            r0 = r12
            r12 = 0
        L88:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.kq01.p(com.vk.im.engine.models.dialogs.ChatSettings):com.vk.im.ui.components.chat_controls.ChatControls");
    }

    public static final ChatPermissions q(ChatControls chatControls) {
        return new ChatPermissions(chatControls.b, chatControls.c, chatControls.d, chatControls.e, chatControls.f, chatControls.g, chatControls.h, chatControls.i);
    }

    public static final ImageRequestBuilder r(fxj0 fxj0Var, int i, int i2, boolean z, ScaleType scaleType) {
        int round;
        Uri parse = Uri.parse(fxj0Var.getUrl());
        ImageRequestBuilder h2 = ImageRequestBuilder.h(parse);
        h2.f = new q0v0(liw.a(), new Size(i, i2), parse);
        if (z) {
            x9g0 x9g0Var = null;
            if (fxj0Var.e6() / (i * i2) >= 1.3f) {
                int height = fxj0Var.getHeight();
                int width = fxj0Var.getWidth();
                if (scaleType == ScaleType.CENTER_CROP) {
                    float f2 = width;
                    float f3 = height;
                    float max = Math.max(i / f2, i2 / f3);
                    round = Math.round(f2 * max);
                    i2 = Math.round(f3 * max);
                } else {
                    if (scaleType == ScaleType.CENTER_INSIDE || scaleType == ScaleType.FIT_START || scaleType == ScaleType.FIT_CENTER || scaleType == ScaleType.FIT_END) {
                        float f4 = width;
                        float f5 = height;
                        float min = Math.min(i / f4, i2 / f5);
                        round = Math.round(f4 * min);
                        i2 = Math.round(f5 * min);
                    }
                    if (i > 0 && i2 > 0) {
                        x9g0Var = new x9g0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, i2, 12);
                    }
                }
                i = round;
                if (i > 0) {
                    x9g0Var = new x9g0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, i2, 12);
                }
            }
            h2.d = x9g0Var;
        }
        return h2;
    }

    public static String s(int i) {
        return uqi.a("AdSource(configCode=", i, ')');
    }

    public static zlu0 t() {
        wi wiVar = new wi(f870.d(4278220799L), f870.d(4280715499L), f870.d(4279500752L), f870.d(4288916920L), f870.d(4283151179L), f870.d(4289722125L), f870.d(4294942720L), f870.d(4293942340L), f870.d(4294554959L), f870.d(4294205439L), f870.d(4285750502L), f870.d(4292886443L), f870.d(4294914887L), f870.d(4282354400L), f870.d(4286131904L));
        wy wyVar = new wy(f870.d(4282354400L));
        nq5 nq5Var = new nq5(f870.d(2566914048L), f870.d(3640655871L));
        cw5 cw5Var = new cw5(f870.d(4293651952L), f870.d(4280715499L), f870.d(4280715499L), f870.d(4280715499L), f870.c(858163435), f870.d(4284129023L), f870.d(4294967295L), f870.d(3439329279L), f870.d(4279834906L), f870.d(4294967295L), f870.d(4294309367L), f870.d(4281085230L), f870.c(872415231), f870.d(4294967295L), f870.d(4293651695L), f870.d(4292800255L), f870.d(4278848010L), f870.d(4294967295L), f870.d(4280032542L), f870.d(4293281350L), f870.d(4294961641L), f870.d(4283151179L), f870.d(4293458408L), f870.d(4294309365L), f870.d(4292994022L), f870.c(167772160), f870.c(503316480), f870.d(4294572537L), f870.c(117440512), f870.d(4294963926L));
        fp8 fp8Var = new fp8(f870.d(4280715499L), f870.d(4280715499L), f870.d(4280715499L));
        e7r e7rVar = new e7r(f870.d(4294112245L), f870.c(503316480), f870.c(1526726656), f870.c(1023410176));
        jwu jwuVar = new jwu(f870.d(4294967295L));
        vpv vpvVar = new vpv(f870.d(4280715499L), f870.d(4280715499L), f870.d(4294967295L), f870.d(4294112245L), f870.d(4294967295L), f870.d(4286680217L), f870.c(2046820352), f870.d(4293281350L), f870.d(4283151179L), f870.d(4281085230L), f870.d(4281085230L), f870.d(4288258733L), f870.c(1526726656), f870.d(4290298316L), f870.c(1023410176), f870.d(4294483996L));
        khw khwVar = new khw(f870.c(335544320), f870.d(4294112245L), f870.c(335551549));
        c9z c9zVar = new c9z(f870.d(4294967295L));
        h290 h290Var = new h290(f870.c(1711276032), f870.c(1140850688));
        xg90 xg90Var = new xg90(f870.d(4280715499L));
        tnh0 tnh0Var = new tnh0(f870.d(4293651952L));
        l5i0 l5i0Var = new l5i0(f870.d(4294967295L), f870.d(4293651695L));
        jki0 jki0Var = new jki0(f870.d(4292335833L), f870.d(4291546317L), f870.d(4290691009L), f870.c(503316480), f870.d(4292994022L));
        eyj0 eyj0Var = new eyj0(f870.d(4294309365L), f870.d(4292994022L));
        irm0 irm0Var = new irm0(f870.d(4280715499L), f870.d(4280715499L), f870.d(4294967295L), f870.c(520093695), f870.d(4293281350L), f870.d(4283151179L), f870.d(4281085230L));
        stn0 stn0Var = new stn0(f870.d(4288258733L));
        lco0 lco0Var = new lco0(f870.d(4280715499L), f870.d(4280516317L), f870.d(4280715499L), f870.d(4294967295L), f870.d(4294967295L), f870.d(4281172448L), f870.d(4281172448L), f870.d(4285639403L), f870.d(4283008716L), f870.d(4281085230L), f870.d(4293281350L), f870.d(4283151179L), f870.d(4278190080L), f870.d(3592759598L), f870.d(4278190080L), f870.d(4286680217L), f870.d(2351245614L), f870.d(4285364357L), f870.d(4288258733L), f870.c(1715157819));
        efp0 efp0Var = new efp0(f870.d(4292994022L), f870.d(4288724964L));
        long j = l5g.j;
        return new zlu0(wiVar, wyVar, nq5Var, cw5Var, fp8Var, e7rVar, jwuVar, vpvVar, khwVar, c9zVar, h290Var, xg90Var, tnh0Var, l5i0Var, jki0Var, eyj0Var, irm0Var, stn0Var, lco0Var, efp0Var, new kop0(j, f870.c(335548477), f870.c(167776317)), new u3w0(f870.c(167772160), f870.d(4294112245L), j, f870.d(4281172448L), f870.d(4278220799L), f870.c(503316480), j, f870.d(4292994022L), f870.d(4294967295L), f870.c(858163435), f870.d(4288258733L), f870.d(4286546565L), f870.d(4293651952L), f870.d(4283531704L), f870.d(4285954170L), f870.d(4293651952L), f870.d(4286680217L), f870.d(4280715499L), f870.d(4285833942L), f870.d(4286680217L), f870.d(4288258733L), f870.d(4292335833L), f870.d(4286935632L), f870.d(4289435761L), f870.d(4293651952L), f870.d(4294967295L), f870.d(4293651695L), f870.d(4293323263L), f870.d(4292139247L), f870.d(4291618047L), f870.d(4289575167L), f870.c(1027958671), f870.d(4281172448L), f870.d(4292994022L), f870.c(637534208), f870.d(4293651952L), f870.d(4285954170L), j, f870.d(4278190080L), f870.d(4278190080L), f870.d(4285954170L), f870.d(4288258733L), f870.d(4289640386L), f870.d(4278197309L), f870.d(4282738575L), f870.d(4294967295L), f870.d(4286680217L), f870.d(4294967295L), f870.d(4294967295L), f870.c(637534208), f870.d(4292994022L), f870.d(4293651952L), f870.d(4280907212L), f870.d(4294572537L), f870.d(4288258733L), f870.d(4287665305L), f870.d(4281172448L), f870.d(4290298316L), f870.d(4288258733L), f870.d(4281172448L), f870.d(4294572537L), f870.d(4292335833L), f870.d(4278190080L), f870.d(2583691263L), f870.d(4294240195L), f870.d(4293120940L), f870.d(4294572537L), f870.d(4291613695L), f870.d(4292335833L), f870.d(4292474111L), f870.d(4290956287L), f870.d(4289784063L), f870.d(4292474111L), f870.d(4289784063L), f870.d(4294967295L), f870.d(4293651695L), f870.d(4289582079L), f870.d(4278190080L), f870.d(4281172448L), f870.d(4286680217L), f870.d(4288258733L), f870.d(4294967295L), f870.c(419445107), f870.d(4278190080L), f870.d(4282730055L)), new d2y0(f870.d(4282354400L), f870.d(4294112245L), f870.d(4292994022L), f870.c(335544320)), true);
    }

    @Override // xsna.kwn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void e(Pair pair, zzs zzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(273548432);
        if ((i & 6) == 0) {
            i2 = (M.J(pair) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(zzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(273548432, i2, -1, "com.vk.design.demo.presentation.screens.DonutUserStackContent.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Content (DonutUserStackContent.kt:139)");
            }
            zzsVar.invoke(fwu0.l(null, (String) pair.i(), null, null, M, 0, 61), pair.j(), M, Integer.valueOf(((i2 << 3) & 896) | 8));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ijl(i, 1, this, pair, zzsVar);
        }
    }

    @Override // xsna.h5p
    public Object f(i4p i4pVar, ota0 ota0Var, Integer num, g5p g5pVar, p4p.b bVar) {
        return ota0Var;
    }

    @Override // xsna.sj0
    public int getAdapterPosition() {
        return 0;
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Boolean.valueOf(zzox.zzd());
    }
}
