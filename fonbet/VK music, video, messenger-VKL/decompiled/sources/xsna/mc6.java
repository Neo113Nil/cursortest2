package xsna;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.X3;
import com.vk.dto.ads.PixelStats;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.libvideo.api.ad.AdChoice;
import com.vk.toggle.b;
import com.vk.toggle.debug.BaseDebugTogglesFragment;
import com.vk.toggle.internal.ToggleManager;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.collections.EmptyList;
import okhttp3.p;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.it80;
import xsna.l0d0;
import xsna.nmk0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class mc6 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mc6(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x01ba, code lost:
    
        if (r5 == null) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e0  */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        it80 a;
        String str;
        String str2;
        int i;
        String str3;
        String str4;
        Iterable iterable;
        Long l;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONArray optJSONArray;
        Object obj;
        nmk0 nmk0Var;
        int i2;
        String str5;
        JSONArray jSONArray;
        String str6;
        String str7;
        AdChoice.Type type;
        AdChoice.Type type2;
        String optString;
        AdChoice adChoice;
        AdChoice.a aVar;
        JSONObject jSONObject;
        int i3 = 0;
        switch (this.b) {
            case 0:
                return ((BaseDebugTogglesFragment) this.c).go((String) this.d);
            case 1:
                return new l0d0.b(LayoutInflater.from((cro0) this.c).inflate(R.layout.clips_wrapper_fragment_content, (ViewGroup) this.d, false));
            case 2:
                String str8 = (String) this.d;
                nmk0 nmk0Var2 = (nmk0) this.c;
                o260 o260Var = d260.a;
                if (o260Var == null) {
                    o260Var = null;
                }
                okhttp3.o oVar = new okhttp3.o(o260Var.i(NetworkClient.ClientType.CLIENT_DEFAULT));
                p.a aVar2 = new p.a();
                aVar2.i(str8);
                okhttp3.u execute = ((f8f0) oVar.a(aVar2.b())).execute();
                if (execute.t()) {
                    okhttp3.v vVar = execute.h;
                    String string = vVar != null ? vVar.string() : null;
                    if (string != null) {
                        JSONObject jSONObject2 = new JSONObject(string);
                        String A = f370.A("trackingLink", jSONObject2);
                        if (A == null) {
                            it80.b.getClass();
                            return it80.a.a();
                        }
                        JSONArray optJSONArray2 = jSONObject2.optJSONArray("statistics");
                        if (optJSONArray2 != null) {
                            int length = optJSONArray2.length();
                            int i4 = 0;
                            while (true) {
                                if (i4 < length) {
                                    jSONObject = optJSONArray2.getJSONObject(i4);
                                    if (!epx.f(jSONObject.optString("type"), "playheadViewabilityValue") || jSONObject.optInt("duration", -1) != 0 || jSONObject.optInt("viewablePercent", -1) != 50) {
                                        i4++;
                                    }
                                } else {
                                    jSONObject = null;
                                }
                            }
                            if (jSONObject != null) {
                                str = jSONObject.optString("url");
                                if (str != null) {
                                    it80.b.getClass();
                                    return it80.a.a();
                                }
                                String optString2 = jSONObject2.optString("ageRestrictions");
                                if (optString2 == null) {
                                    optString2 = "18+";
                                }
                                JSONObject optJSONObject3 = jSONObject2.optJSONObject("adLabel");
                                String str9 = "text";
                                if (optJSONObject3 == null || (str2 = optJSONObject3.optString("text")) == null) {
                                    str2 = "";
                                }
                                AdChoice adChoice2 = new AdChoice(v1v.a(' ', str2, optString2), AdChoice.Type.AGE, null);
                                JSONObject optJSONObject4 = jSONObject2.optJSONObject("adChoices");
                                if (optJSONObject4 == null || (optJSONObject = optJSONObject4.optJSONObject("tabs")) == null || (optJSONObject2 = optJSONObject.optJSONObject(X3.i.Z)) == null || (optJSONArray = optJSONObject2.optJSONArray("items")) == null) {
                                    i = 0;
                                    str3 = str;
                                    str4 = A;
                                    iterable = EmptyList.b;
                                } else {
                                    ArrayList arrayList = new ArrayList(optJSONArray.length());
                                    int length2 = optJSONArray.length();
                                    int i5 = 0;
                                    while (i5 < length2) {
                                        JSONObject optJSONObject5 = optJSONArray.optJSONObject(i5);
                                        if (optJSONObject5 != null) {
                                            String optString3 = optJSONObject5.optString("name");
                                            if (optString3 == null) {
                                                nmk0Var = nmk0Var2;
                                                i2 = i3;
                                            } else {
                                                i2 = i3;
                                                if (rl3.G((String[]) nmk0Var2.b.getValue(), optString3)) {
                                                    int hashCode = optString3.hashCode();
                                                    nmk0Var = nmk0Var2;
                                                    str5 = str;
                                                    if (hashCode == -599449367) {
                                                        if (optString3.equals("complain")) {
                                                            type = AdChoice.Type.COMPLAIN;
                                                            type2 = AdChoice.Type.RULES;
                                                            if (type == type2) {
                                                            }
                                                            str6 = A;
                                                            String optString4 = optJSONObject5.optString("actionValue");
                                                            if (type != type2) {
                                                            }
                                                            adChoice = new AdChoice(optString, type, aVar);
                                                            arrayList.add(adChoice);
                                                        }
                                                        type = AdChoice.Type.OTHER;
                                                        type2 = AdChoice.Type.RULES;
                                                        if (type == type2) {
                                                        }
                                                        str6 = A;
                                                        String optString42 = optJSONObject5.optString("actionValue");
                                                        if (type != type2) {
                                                        }
                                                        adChoice = new AdChoice(optString, type, aVar);
                                                        arrayList.add(adChoice);
                                                    } else if (hashCode != 92611469) {
                                                        if (hashCode == 108873975 && optString3.equals("rules")) {
                                                            type = AdChoice.Type.RULES;
                                                            type2 = AdChoice.Type.RULES;
                                                            if (type == type2) {
                                                                optString = optJSONObject5.optString(str9);
                                                                jSONArray = optJSONArray;
                                                                break;
                                                            } else {
                                                                optString = "Правила размещения";
                                                                jSONArray = optJSONArray;
                                                            }
                                                            str6 = A;
                                                            String optString422 = optJSONObject5.optString("actionValue");
                                                            if (type != type2) {
                                                                aVar = new AdChoice.a.d(i5s.a(new StringBuilder("https://ads."), a0a.d, "/help/documents/moderation"));
                                                                str7 = str9;
                                                            } else {
                                                                String optString5 = optJSONObject5.optString("action");
                                                                if (optString5 != null) {
                                                                    int hashCode2 = optString5.hashCode();
                                                                    str7 = str9;
                                                                    if (hashCode2 != -776144932) {
                                                                        if (hashCode2 != -599449367) {
                                                                            if (hashCode2 == 3059573 && optString5.equals("copy")) {
                                                                                aVar = type == AdChoice.Type.COPY_ERID ? new AdChoice.a.b(optString422) : new AdChoice.a.c(optString422);
                                                                            }
                                                                        } else if (optString5.equals("complain")) {
                                                                            aVar = AdChoice.a.C1193a.a;
                                                                        }
                                                                    } else if (optString5.equals("redirect")) {
                                                                        aVar = new AdChoice.a.d(optString422);
                                                                    }
                                                                } else {
                                                                    str7 = str9;
                                                                }
                                                                aVar = null;
                                                            }
                                                            adChoice = new AdChoice(optString, type, aVar);
                                                            arrayList.add(adChoice);
                                                        }
                                                        type = AdChoice.Type.OTHER;
                                                        type2 = AdChoice.Type.RULES;
                                                        if (type == type2) {
                                                        }
                                                        str6 = A;
                                                        String optString4222 = optJSONObject5.optString("actionValue");
                                                        if (type != type2) {
                                                        }
                                                        adChoice = new AdChoice(optString, type, aVar);
                                                        arrayList.add(adChoice);
                                                    } else {
                                                        if (optString3.equals("about")) {
                                                            type = AdChoice.Type.ABOUT;
                                                            type2 = AdChoice.Type.RULES;
                                                            if (type == type2) {
                                                            }
                                                            str6 = A;
                                                            String optString42222 = optJSONObject5.optString("actionValue");
                                                            if (type != type2) {
                                                            }
                                                            adChoice = new AdChoice(optString, type, aVar);
                                                            arrayList.add(adChoice);
                                                        }
                                                        type = AdChoice.Type.OTHER;
                                                        type2 = AdChoice.Type.RULES;
                                                        if (type == type2) {
                                                        }
                                                        str6 = A;
                                                        String optString422222 = optJSONObject5.optString("actionValue");
                                                        if (type != type2) {
                                                        }
                                                        adChoice = new AdChoice(optString, type, aVar);
                                                        arrayList.add(adChoice);
                                                    }
                                                } else {
                                                    nmk0Var = nmk0Var2;
                                                }
                                            }
                                            str5 = str;
                                            jSONArray = optJSONArray;
                                            str6 = A;
                                            str7 = str9;
                                            adChoice = null;
                                            arrayList.add(adChoice);
                                        } else {
                                            nmk0Var = nmk0Var2;
                                            i2 = i3;
                                            str5 = str;
                                            jSONArray = optJSONArray;
                                            str6 = A;
                                            str7 = str9;
                                        }
                                        i5++;
                                        i3 = i2;
                                        nmk0Var2 = nmk0Var;
                                        str = str5;
                                        optJSONArray = jSONArray;
                                        A = str6;
                                        str9 = str7;
                                    }
                                    i = i3;
                                    str3 = str;
                                    str4 = A;
                                    iterable = j5g.V(arrayList);
                                    Iterator it = iterable.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            obj = it.next();
                                            if (epx.f(((AdChoice) obj).c, AdChoice.a.C1193a.a)) {
                                            }
                                        } else {
                                            obj = null;
                                        }
                                    }
                                    AdChoice adChoice3 = (AdChoice) obj;
                                    if (adChoice3 != null) {
                                        ArrayList arrayList2 = new ArrayList();
                                        for (Object obj2 : iterable) {
                                            if (!epx.f(((AdChoice) obj2).c, AdChoice.a.C1193a.a)) {
                                                arrayList2.add(obj2);
                                            }
                                        }
                                        iterable = j5g.v0(adChoice3, arrayList2);
                                    }
                                }
                                ArrayList u0 = j5g.u0(iterable, Collections.singletonList(adChoice2));
                                String a2 = execute.g.a("x-trace-id");
                                if (a2 == null) {
                                    a2 = null;
                                }
                                String A2 = f370.A("pad_id", jSONObject2);
                                char[] cArr = new char[1];
                                cArr[i] = '?';
                                int i6 = i;
                                String str10 = (String) j5g.a0(drm0.b0(str8, cArr, i6, 6));
                                if (str10 != null) {
                                    char[] cArr2 = new char[1];
                                    cArr2[i6] = '/';
                                    String str11 = (String) j5g.k0(drm0.b0(str10, cArr2, i6, 6));
                                    if (str11 != null) {
                                        l = arm0.n(str11);
                                        it80.a aVar3 = it80.b;
                                        nmk0.a aVar4 = new nmk0.a(new omk0(new PixelStats(str4, null, null, 6, null), new PixelStats(str3, null, null, 6, null)), u0, str8, a2, A2, l);
                                        aVar3.getClass();
                                        a = new it80(aVar4);
                                    }
                                }
                                l = null;
                                it80.a aVar32 = it80.b;
                                nmk0.a aVar42 = new nmk0.a(new omk0(new PixelStats(str4, null, null, 6, null), new PixelStats(str3, null, null, 6, null)), u0, str8, a2, A2, l);
                                aVar32.getClass();
                                a = new it80(aVar42);
                            }
                        }
                        str = null;
                        if (str != null) {
                        }
                    } else {
                        a = null;
                    }
                } else {
                    it80.b.getClass();
                    a = it80.a.a();
                }
                if (a != null) {
                    return a;
                }
                it80.b.getClass();
                return it80.a.a();
            default:
                b.c cVar = (b.c) this.c;
                d0r0 d0r0Var = (d0r0) this.d;
                List<b.d> list = cVar.b;
                ArrayList arrayList3 = new ArrayList();
                for (b.d dVar : list) {
                    ToggleManager toggleManager = d0r0Var.a;
                    String obj3 = dVar.b.toString();
                    ToggleManager.a aVar5 = ToggleManager.z;
                    b.d j = toggleManager.j(obj3, false);
                    if (j != null) {
                        arrayList3.add(j);
                    }
                }
                return arrayList3;
        }
    }

    public /* synthetic */ mc6(String str, nmk0 nmk0Var) {
        this.b = 2;
        this.d = str;
        this.c = nmk0Var;
    }

    public /* synthetic */ mc6(l0d0 l0d0Var, cro0 cro0Var, FrameLayout frameLayout) {
        this.b = 1;
        this.c = cro0Var;
        this.d = frameLayout;
    }
}
