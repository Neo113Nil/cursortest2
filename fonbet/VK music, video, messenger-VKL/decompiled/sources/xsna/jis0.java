package xsna;

import com.vk.api.generated.uxpolls.dto.UxpollsGetResponseDto;
import com.vk.api.generated.uxpolls.dto.UxpollsPollDto;
import com.vk.stat.scheme.CommonUxpollsStat$TypeUxpollsEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.itk0;

/* compiled from: VideoDynamicPollDelegate.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class jis0 extends FunctionReferenceImpl implements wzs<UxpollsGetResponseDto, Throwable, s3q0> {
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s3q0 invoke(UxpollsGetResponseDto uxpollsGetResponseDto, Throwable th) {
        itk0 itk0Var;
        itk0.b bVar;
        JSONObject optJSONObject;
        List<String> f;
        UxpollsGetResponseDto uxpollsGetResponseDto2 = uxpollsGetResponseDto;
        Throwable th2 = th;
        kis0 kis0Var = (kis0) this.receiver;
        lis0 lis0Var = kis0Var.b;
        if (kis0Var.d == null) {
            kis0Var.a();
        } else {
            itk0.a aVar = itk0.a.a;
            if (uxpollsGetResponseDto2 != null) {
                if (uxpollsGetResponseDto2.getCount() > 0 && !uxpollsGetResponseDto2.e().isEmpty()) {
                    UxpollsPollDto uxpollsPollDto = (UxpollsPollDto) j5g.a0(uxpollsGetResponseDto2.e());
                    String str = (uxpollsPollDto == null || (f = uxpollsPollDto.f()) == null) ? null : (String) j5g.a0(f);
                    String e = uxpollsPollDto != null ? uxpollsPollDto.e() : null;
                    if (str != null && e != null) {
                        try {
                            optJSONObject = new JSONObject(e).getJSONArray("questions").optJSONObject(0);
                        } catch (JSONException e2) {
                            com.vk.metrics.eventtracking.b.a.a(e2);
                        }
                        if (optJSONObject != null) {
                            int i = optJSONObject.has("id") ? optJSONObject.getInt("id") : 0;
                            String string = optJSONObject.has("statement") ? optJSONObject.getString("statement") : "";
                            JSONArray jSONArray = optJSONObject.getJSONArray("variants");
                            ArrayList arrayList = new ArrayList(jSONArray.length());
                            int length = jSONArray.length();
                            int i2 = 0;
                            while (i2 < length) {
                                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                                UxpollsPollDto uxpollsPollDto2 = uxpollsPollDto;
                                JSONArray jSONArray2 = jSONArray;
                                arrayList.add(new ikr0(Integer.valueOf(f370.w(jSONObject, 0, "index")), Integer.valueOf(i), str, jSONObject.has("text") ? jSONObject.getString("text") : ""));
                                i2++;
                                uxpollsPollDto = uxpollsPollDto2;
                                jSONArray = jSONArray2;
                            }
                            itk0Var = new itk0.b(string, arrayList, uxpollsPollDto.getId());
                            bVar = !(itk0Var instanceof itk0.b) ? (itk0.b) itk0Var : null;
                            if (bVar != null) {
                                kis0Var.e = bVar;
                                kis0Var.b(CommonUxpollsStat$TypeUxpollsEvent.EventType.SHOW);
                            }
                            lis0Var.a(itk0Var);
                        }
                    }
                }
                itk0Var = aVar;
                if (!(itk0Var instanceof itk0.b)) {
                }
                if (bVar != null) {
                }
                lis0Var.a(itk0Var);
            }
            if (th2 != null) {
                com.vk.metrics.eventtracking.b.a.a(th2);
                lis0Var.a(aVar);
            }
        }
        return s3q0.a;
    }
}
