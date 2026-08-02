package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.vx2;

/* compiled from: ModelConfig.java */
/* loaded from: classes.dex */
public final class z230 {
    public static boolean a = false;
    public static vx2.a b;

    /* compiled from: ModelConfig.java */
    public interface a {
        ArrayList a(JSONObject jSONObject) throws JSONException;

        float b();

        UserId c();

        Context getContext();

        int t();
    }
}
