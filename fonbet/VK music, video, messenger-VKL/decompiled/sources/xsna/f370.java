package xsna;

import android.app.Service;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.RectF;
import android.view.View;
import com.google.android.play.core.splitinstall.internal.zzbl;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.api.generated.narratives.dto.NarrativesCoverDto;
import com.vk.api.generated.narratives.dto.NarrativesNarrativeDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.stories.dto.StoriesStoryDto;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.dto.narratives.HighlightCover;
import com.vk.dto.narratives.HighlightRemoteCustomCover;
import com.vk.dto.narratives.HighlightRemoteStoryCover;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.stories.entities.StorySharingInfo;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.log.L;
import com.vk.sharing.api.dto.AttachmentInfo;
import io.jsonwebtoken.JwtParser;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NoOpCacheEventListener.java */
@vby
/* loaded from: classes12.dex */
public final class f370 implements rw8, io.reactivex.rxjava3.functions.l, pl50 {
    public static f370 c;
    public static final f370 d = new f370(4);
    public static n4p e;
    public final /* synthetic */ int b;

    public /* synthetic */ f370(int i) {
        this.b = i;
    }

    public static final String A(String str, JSONObject jSONObject) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }

    public static StorySharingInfo B(Playlist playlist) {
        AttachmentInfo h = z74.h(playlist);
        Attachment attachment = (Attachment) h.f.getParcelable("attachments");
        int i = h.b;
        return new StorySharingInfo(h.b, Long.valueOf(h.c), Long.valueOf(h.d), h.e, z74.l(h, null), udm0.b(i, attachment), udm0.a(i, attachment), udm0.c(i, attachment, false), true, true);
    }

    public static final String C(String str, String str2, JSONObject jSONObject) throws JSONException {
        return jSONObject.has(str) ? jSONObject.getString(str) : str2;
    }

    public static final String D(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    public static String E(String str, Object... objArr) {
        int indexOf;
        String sb;
        String valueOf = String.valueOf(str);
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e2) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e2);
                    StringBuilder a = t33.a("<", str2, " threw ");
                    a.append(e2.getClass().getName());
                    a.append(">");
                    sb = a.toString();
                }
            }
            objArr[i2] = sb;
        }
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + valueOf.length());
        int i3 = 0;
        while (i < objArr.length && (indexOf = valueOf.indexOf("%s", i3)) != -1) {
            sb2.append((CharSequence) valueOf, i3, indexOf);
            sb2.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb2.append((CharSequence) valueOf, i3, valueOf.length());
        if (i < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb2.append(", ");
                sb2.append(objArr[i4]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Narrative F(NarrativesNarrativeDto narrativesNarrativeDto, Map map, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        HighlightCover highlightRemoteCustomCover;
        HighlightCover highlightCover;
        List<Integer> i;
        int id = narrativesNarrativeDto.getId();
        UserId q = narrativesNarrativeDto.q();
        Object obj = null;
        Owner owner = map != null ? (Owner) map.get(q) : null;
        List<StoriesStoryDto> g = narrativesNarrativeDto.g();
        if (g == null) {
            g = EmptyList.b;
        }
        List<StoriesStoryDto> list = g;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ivl0.a((StoriesStoryDto) it.next(), map, linkedHashMap, linkedHashMap2));
        }
        NarrativesCoverDto f = narrativesNarrativeDto.f();
        if (f != null) {
            Float g2 = f.g();
            Float i2 = f.i();
            Float f2 = f.f();
            Float e2 = f.e();
            RectF rectF = (g2 == null || i2 == null || e2 == null || f2 == null) ? null : new RectF(g2.floatValue(), i2.floatValue(), f2.floatValue() + g2.floatValue(), e2.floatValue() + i2.floatValue());
            new ne6();
            Image a = ne6.a(f.j());
            Integer d2 = f.d();
            PhotosPhotoDto k = f.k();
            if (rectF != null || !a.b.isEmpty() || d2 != null || k != null) {
                if (d2 != null) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (((StoryEntry) next).c == d2.intValue()) {
                            obj = next;
                            break;
                        }
                    }
                    highlightRemoteCustomCover = new HighlightRemoteStoryCover(a, (StoryEntry) obj, d2.intValue(), rectF);
                } else {
                    highlightRemoteCustomCover = new HighlightRemoteCustomCover(a, k != null ? xfa0.a(k) : null, rectF);
                }
                highlightCover = highlightRemoteCustomCover;
                boolean j = narrativesNarrativeDto.j();
                boolean e3 = narrativesNarrativeDto.e();
                Boolean d3 = narrativesNarrativeDto.d();
                boolean booleanValue = d3 == null ? d3.booleanValue() : false;
                boolean k2 = narrativesNarrativeDto.k();
                i = narrativesNarrativeDto.i();
                if (i == null) {
                    i = EmptyList.b;
                }
                return new Narrative(id, q, narrativesNarrativeDto.getTitle(), highlightCover, owner, arrayList, j, e3, booleanValue, k2, i);
            }
        }
        highlightCover = null;
        boolean j2 = narrativesNarrativeDto.j();
        boolean e32 = narrativesNarrativeDto.e();
        Boolean d32 = narrativesNarrativeDto.d();
        boolean booleanValue2 = d32 == null ? d32.booleanValue() : false;
        boolean k22 = narrativesNarrativeDto.k();
        i = narrativesNarrativeDto.i();
        if (i == null) {
        }
        return new Narrative(id, q, narrativesNarrativeDto.getTitle(), highlightCover, owner, arrayList, j2, e32, booleanValue2, k22, i);
    }

    public static final Integer G(String str) {
        if (str != null && !drm0.N(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    public static void H(View view, String str) {
        iut0.q(view, new xm(true, str));
    }

    public static final int[] I(JSONArray jSONArray) {
        int[] iArr = new int[jSONArray.length()];
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            iArr[i] = jSONArray.getInt(i);
        }
        return iArr;
    }

    public static final ArrayList J(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(Integer.valueOf(jSONArray.getInt(i)));
        }
        return arrayList;
    }

    public static final ArrayList K(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.get(i));
        }
        return arrayList;
    }

    public static final ArrayList L(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(Long.valueOf(jSONArray.getLong(i)));
        }
        return arrayList;
    }

    public static final HashMap M(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.get(next));
        }
        return hashMap;
    }

    public static String N(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "CornerRadius.circular(" + bu00.u(Float.intBitsToFloat(i)) + ')';
        }
        return "CornerRadius.elliptical(" + bu00.u(Float.intBitsToFloat(i)) + ", " + bu00.u(Float.intBitsToFloat(i2)) + ')';
    }

    public static final ArrayList O(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        int i = 0;
        while (i < length) {
            i = wq.b(jSONArray, i, arrayList, i, 1);
        }
        return arrayList;
    }

    public static final q630 P(q630 q630Var, float f) {
        return q630Var.g(new y5y0(f));
    }

    public static r301 Q(Class cls, Object obj, String str) {
        return new r301(obj, T(obj, str), Array.newInstance((Class<?>) cls, 0).getClass());
    }

    public static Object R() {
        try {
            Constructor declaredConstructor = AssetManager.class.getDeclaredConstructor(null);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor.newInstance(null);
        } catch (Exception e2) {
            throw new zzbl("Failed to invoke default constructor on class ".concat(AssetManager.class.getName()), e2);
        }
    }

    public static Object S(Object obj, String str, Class cls, Class cls2, Serializable serializable) {
        try {
            return cls.cast(U(obj.getClass(), str, cls2).invoke(obj, serializable));
        } catch (Exception e2) {
            throw new zzbl("Failed to invoke method " + str + " on an object of type " + obj.getClass(), e2);
        }
    }

    public static Field T(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new zzbl(y57.a("Failed to find a field named ", str, " on an object of instance ", obj.getClass().getName()));
    }

    public static Method U(Class cls, String str, Class... clsArr) {
        for (Class cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            try {
                Method declaredMethod = cls2.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new zzbl(String.format("Could not find a method named %s with parameters %s in type %s", str, Arrays.asList(clsArr), cls));
    }

    public static final long i(float f, float f2) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        int i = lkp0.c;
        return floatToRawIntBits;
    }

    public static smz j(smz smzVar, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = smzVar.a;
        }
        if ((i & 2) != 0) {
            z2 = smzVar.b;
        }
        return (z == smzVar.a && z2 == smzVar.b) ? smzVar : new smz(z, z2);
    }

    public static StackTraceElement k() {
        Exception exc = new Exception();
        String simpleName = x7y0.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        return new StackTraceElement("_COROUTINE.".concat(simpleName), BundleUtil.UNDERLINE_TAG, stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    public static final l7m m(Service service, mdx0 mdx0Var) {
        return mdx0Var.a(service);
    }

    public static final boolean o(long j, long j2) {
        return j == j2;
    }

    public static final boolean p(JSONObject jSONObject, String str, boolean z) throws JSONException {
        return jSONObject.has(str) ? jSONObject.getBoolean(str) : z;
    }

    public static final Boolean q(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject.has(str)) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        return null;
    }

    public static final int r(String str) {
        int i = str.charAt(0) == '#' ? 1 : 0;
        if ((i != 0 && (str.length() == 4 || str.length() == 5)) || (i == 0 && (str.length() == 3 || str.length() == 4))) {
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            while (i < length) {
                sb.append(str.charAt(i));
                sb.append(str.charAt(i));
                i++;
            }
            str = t9c.b("#", sb);
        }
        return Color.parseColor(str.toUpperCase(Locale.ROOT));
    }

    public static CharSequence s(qvw0 qvw0Var) {
        String r = rte0.r(qvw0Var.c());
        String p = brm0.p(qvw0Var.d(), Locale.getDefault());
        String p2 = brm0.p(qvw0Var.e(), Locale.getDefault());
        boolean z = p2.length() > 1;
        if (z) {
            p2 = p2.substring(0, 1);
        } else if (z) {
            throw new NoWhenBranchMatchedException();
        }
        if (!drm0.N(p2)) {
            p = p + ' ' + p2 + JwtParser.SEPARATOR_CHAR;
        }
        new gdp();
        if (r == null) {
            r = p;
        }
        return gdp.a(r);
    }

    public static final Double t(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject.has(str)) {
            return Double.valueOf(jSONObject.getDouble(str));
        }
        return null;
    }

    public static final Float u(String str, JSONObject jSONObject) throws JSONException {
        if (jSONObject.has(str)) {
            return Float.valueOf((float) jSONObject.getDouble(str));
        }
        return null;
    }

    public static synchronized f370 v() {
        f370 f370Var;
        synchronized (f370.class) {
            try {
                if (c == null) {
                    c = new f370(0);
                }
                f370Var = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return f370Var;
    }

    public static final int w(JSONObject jSONObject, int i, String str) throws JSONException {
        return jSONObject.has(str) ? jSONObject.getInt(str) : i;
    }

    public static final Integer x(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject.has(str)) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        return null;
    }

    public static final long y(JSONObject jSONObject, String str, long j) throws JSONException {
        return jSONObject.has(str) ? jSONObject.getLong(str) : j;
    }

    public static final Long z(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject.has(str)) {
            return Long.valueOf(jSONObject.getLong(str));
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) throws Throwable {
        Throwable th = (Throwable) obj;
        if (!(th instanceof IOException)) {
            return io.reactivex.rxjava3.core.q.H(th);
        }
        io.reactivex.rxjava3.core.q.T(new Object());
        return io.reactivex.rxjava3.core.q.B0(3000L, TimeUnit.MILLISECONDS);
    }

    @Override // xsna.pl50
    public void b(gzs gzsVar) {
        switch (this.b) {
            case 4:
                break;
            default:
                L.c("UnstableNetworkDetectorLogger", gzsVar);
                break;
        }
    }

    public void n(Throwable th) {
        L.g("UnstableNetworkDetectorLogger", th);
    }

    private final void l(gzs gzsVar) {
    }

    @Override // xsna.rw8
    public void a(jzi0 jzi0Var) {
    }

    @Override // xsna.rw8
    public void c(jzi0 jzi0Var) {
    }

    @Override // xsna.rw8
    public void d(jzi0 jzi0Var) {
    }

    @Override // xsna.rw8
    public void e(jzi0 jzi0Var) {
    }

    @Override // xsna.rw8
    public void f(jzi0 jzi0Var) {
    }

    @Override // xsna.rw8
    public void g(jzi0 jzi0Var) {
    }

    @Override // xsna.rw8
    public void h(jzi0 jzi0Var) {
    }
}
