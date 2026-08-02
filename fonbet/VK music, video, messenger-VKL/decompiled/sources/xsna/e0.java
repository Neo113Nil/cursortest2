package xsna;

import android.content.Context;
import android.util.ArrayMap;
import android.util.SparseArray;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebResourceError;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.Aa;
import com.ironsource.B2;
import com.ironsource.Eg;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.vk.clips.sdk.stats.pixels.models.AdStatPixel;
import com.vk.dto.common.Attachment;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import org.webrtc.EglRenderer;
import ru.ok.android.webrtc.opengl.CallOpenGLContext;
import xsna.j9y0;
import xsna.l4o0;
import xsna.umc0;
import xsna.xar0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [com.vk.pushes.PushAwareActivity, xsna.l4o0$b] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                Aa.b((LevelPlayAdInfo) this.c, (Aa) this.d);
                break;
            case 1:
                SparseArray sparseArray = (SparseArray) this.c;
                mi0 mi0Var = (mi0) this.d;
                bjk0 bjk0Var = new bjk0(sparseArray);
                while (bjk0Var.hasNext()) {
                    int nextInt = bjk0Var.nextInt();
                    List list = (List) sparseArray.get(nextInt);
                    f0 f0Var = new f0(1, mi0Var, list);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        mi0Var.c.put((AdStatPixel) it.next(), f0Var);
                    }
                    mi0Var.b.postDelayed(f0Var, TimeUnit.SECONDS.toMillis(nextInt));
                }
                break;
            case 2:
                B2.a((B2) this.c, (Eg) this.d);
                break;
            case 3:
                CallOpenGLContext.c((izs) this.c, (CallOpenGLContext) this.d);
                break;
            case 4:
                ((EglRenderer) this.c).lambda$releaseEglSurface$4((Runnable) this.d);
                break;
            case 5:
                afw afwVar = (afw) this.c;
                Context context = (Context) this.d;
                afwVar.c.requestFocus();
                EditText editText = afwVar.c;
                editText.setSelection(editText.getText().length());
                ((InputMethodManager) context.getSystemService("input_method")).showSoftInput(editText, 0);
                break;
            case 6:
                umc0 umc0Var = (umc0) this.c;
                CharSequence charSequence = (CharSequence) this.d;
                HashSet<String> hashSet = umc0Var.f;
                ArrayMap<Attachment, String> arrayMap = umc0Var.e;
                qdc0 qdc0Var = umc0Var.b;
                ArrayList arrayList = new ArrayList();
                Matcher matcher = hd60.a().Y().matcher(charSequence);
                int i = 0;
                while (matcher.find(i)) {
                    int i2 = crx0.i(matcher);
                    if (i2 == -1) {
                        i = matcher.end();
                    } else {
                        int start = matcher.start(i2);
                        i = crx0.h(matcher, i2);
                        String obj = charSequence.subSequence(start, i).toString();
                        if (drm0.E(obj, JwtParser.SEPARATOR_CHAR)) {
                            arrayList.add(new umc0.a(obj, start, i));
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                if (!arrayList2.isEmpty()) {
                    for (Attachment attachment : qdc0Var.u()) {
                        String str = arrayMap.get(attachment);
                        if (str != null) {
                            if (!arrayList2.isEmpty()) {
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    if (epx.f(((umc0.a) it2.next()).a, str)) {
                                        break;
                                    }
                                }
                            }
                            arrayMap.remove(attachment);
                            qdc0Var.n2(attachment);
                        }
                    }
                    g5g.D(arrayList2, true, new q130(umc0Var, 17));
                    g5g.C(hashSet, new zb60(arrayList2, 13), true);
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        umc0.a aVar = (umc0.a) it3.next();
                        arrayList3.add(aVar.a);
                        hashSet.add(aVar.a);
                    }
                    if (!arrayList3.isEmpty()) {
                        umc0Var.a.a(rsg0.y0(new ko(arrayList3), null, null, 3).subscribe(new x150(new lfa(14, umc0Var, arrayList3), 6), new jsb0(new juz(17), 3), new tmc0(0, arrayList3, umc0Var)));
                        break;
                    }
                }
                break;
            case 7:
                ArrayList arrayList4 = (ArrayList) this.c;
                n5f0 n5f0Var = (n5f0) this.d;
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                }
                arrayList4.clear();
                n5f0Var.n.remove(arrayList4);
                break;
            case 8:
                l4o0.a aVar2 = (l4o0.a) this.c;
                ArrayList arrayList5 = (ArrayList) this.d;
                ?? r0 = l4o0.this.h;
                if (r0 != 0) {
                    r0.Z(arrayList5);
                    break;
                }
                break;
            case 9:
                ((rhq0) this.c).e.a((FragmentActivity) this.d);
                break;
            case 10:
                yads.bu1.a((yads.bu1) this.c, (Map) this.d);
                break;
            case 11:
                hxy0 hxy0Var = (hxy0) this.c;
                WebResourceError webResourceError = (WebResourceError) this.d;
                Integer valueOf = webResourceError != null ? Integer.valueOf(webResourceError.getErrorCode()) : null;
                if ((valueOf == null || valueOf.intValue() == -2 || valueOf.intValue() == -6 || valueOf.intValue() == -8) && !hxy0Var.b.a()) {
                    hxy0Var.e.invoke();
                    break;
                } else {
                    var0 var0Var = var0.a;
                    j9y0.b bVar = new j9y0.b(new xar0.a(), hxy0Var.i);
                    var0Var.getClass();
                    var0.a(bVar);
                    hxy0Var.d.invoke();
                    break;
                }
                break;
            default:
                com.vungle.ads.internal.load.i.a((com.vungle.ads.internal.load.j) this.c, (Throwable) this.d);
                break;
        }
    }
}
