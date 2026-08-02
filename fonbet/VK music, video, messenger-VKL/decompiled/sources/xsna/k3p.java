package xsna;

import com.vk.libvideo.design.view.recommended.RecommendedBottomView;
import com.vk.libvideo.live.impl.views.gifts.LiveBottomSheetBehavior;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.utils.Logger;
import xsna.j3p;

/* compiled from: Handler.kt */
/* loaded from: classes18.dex */
public final class k3p implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k3p(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                j3p j3pVar = (j3p) this.c;
                if (!j3pVar.b.isEmpty() || j3pVar.c != null || j3pVar.d != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(Logger.METHOD_E, "stories_creation");
                        Object obj = j3pVar.c;
                        if (obj != null) {
                            jSONObject.put("type", obj);
                        }
                        Object obj2 = j3pVar.d;
                        if (obj2 != null) {
                            jSONObject.put("length", obj2);
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (j3p.a aVar : j3pVar.b.values()) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("action", aVar.a);
                            if (aVar.b) {
                                jSONObject2.put("final", 1);
                            }
                            if ((aVar instanceof j3p.b) && ((j3p.b) aVar).c.size() > 0) {
                                JSONArray jSONArray2 = new JSONArray();
                                Iterator<String> it = ((j3p.b) aVar).c.iterator();
                                while (it.hasNext()) {
                                    jSONArray2.put(it.next());
                                }
                                jSONObject2.put("sticker_ids", jSONArray2);
                            }
                            jSONArray.put(jSONObject2);
                        }
                        jSONObject.put("actions", jSONArray);
                    } catch (Exception unused) {
                    }
                    new c0m(jSONObject.toString()).p();
                    break;
                }
                break;
            default:
                RecommendedBottomView recommendedBottomView = (RecommendedBottomView) this.c;
                LiveBottomSheetBehavior liveBottomSheetBehavior = recommendedBottomView.B;
                if (liveBottomSheetBehavior != null) {
                    liveBottomSheetBehavior.G(5);
                    recommendedBottomView.E = true;
                    break;
                }
                break;
        }
    }
}
