package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.ivm.EditorMessage;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CollageTool.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class w2g extends FunctionReferenceImpl implements wzs<Map<n2k0, ? extends d2g>, Boolean, s3q0> {
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b2, code lost:
    
        if (r13 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0097, code lost:
    
        if (r14 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x007a, code lost:
    
        if (r15 != null) goto L19;
     */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s3q0 invoke(Map<n2k0, ? extends d2g> map, Boolean bool) {
        Map<n2k0, ? extends d2g> map2 = map;
        boolean booleanValue = bool.booleanValue();
        n3g n3gVar = (n3g) this.receiver;
        com.vk.photo.editor.ivm.d dVar = n3gVar.b;
        if (dVar == null) {
            dVar = null;
        }
        bc0 i = n3g.i(dVar);
        if (i != null) {
            HashMap hashMap = new HashMap();
            Iterator<Map.Entry<n2k0, c2g>> it = i.g.a.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Map.Entry<n2k0, c2g> next = it.next();
                    n2k0 key = next.getKey();
                    c2g value = next.getValue();
                    e4p e4pVar = value.i;
                    float f = value.h;
                    float f2 = value.g;
                    float f3 = value.f;
                    float f4 = value.e;
                    if (e4pVar == null) {
                        break;
                    }
                    d2g d2gVar = map2.get(key);
                    if (d2gVar != null) {
                        Float f5 = d2gVar.a;
                        if (f5 == null) {
                            Float f6 = d2gVar.e;
                            f5 = f6 != null ? Float.valueOf(f6.floatValue() + f4) : null;
                        }
                        f4 = f5.floatValue();
                        float f7 = f4;
                        Float f8 = d2gVar.b;
                        if (f8 == null) {
                            Float f9 = d2gVar.f;
                            f8 = f9 != null ? Float.valueOf(f9.floatValue() + f3) : null;
                        }
                        f3 = f8.floatValue();
                        float f10 = f3;
                        Float f11 = d2gVar.c;
                        if (f11 == null) {
                            Float f12 = d2gVar.g;
                            f11 = f12 != null ? Float.valueOf(f12.floatValue() + f2) : null;
                        }
                        f2 = f11.floatValue();
                        Float f13 = d2gVar.d;
                        if (f13 != null) {
                            f = f13.floatValue();
                        } else {
                            Float f14 = d2gVar.h;
                            Float valueOf = f14 != null ? Float.valueOf(f14.floatValue() + f) : null;
                            if (valueOf != null) {
                                f = valueOf.floatValue();
                            }
                        }
                        value = c2g.a(value, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f7, f10, ((Number) swe0.k(Float.valueOf(f2), new awf(0.8f, 2.0f))).floatValue(), ((Number) swe0.k(Float.valueOf(f), new awf(-45.0f, 45.0f))).floatValue(), 271);
                    }
                    hashMap.put(key, value);
                } else {
                    com.vk.photo.editor.ivm.d dVar2 = n3gVar.b;
                    (dVar2 != null ? dVar2 : null).a(new EditorMessage.i(w1g.a(i, null, null, null, null, null, new g2g(hashMap), Double.valueOf(Math.random()), 63), booleanValue ? EditorMessage.Source.UserInput : EditorMessage.Source.Synthetic, 4));
                }
            }
        }
        return s3q0.a;
    }
}
