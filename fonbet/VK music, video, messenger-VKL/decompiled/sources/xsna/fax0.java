package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.reactions.ItemReactions;
import org.json.JSONObject;

/* compiled from: WallRepost.java */
/* loaded from: classes15.dex */
public final class fax0 extends rsg0<a> {

    /* compiled from: WallRepost.java */
    public static class a {
        public final int a;
        public final int b;
        public final int c;

        @Nullable
        public final ItemReactions d;

        public a(int i, int i2, int i3, @Nullable ItemReactions itemReactions) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = itemReactions;
        }
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(@NonNull JSONObject jSONObject) throws Exception, VKApiExecutionException {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            return new a(jSONObject2.getInt("post_id"), jSONObject2.optInt("likes_count", 0), jSONObject2.optInt("reposts_count", 0), tci.o(jSONObject2));
        } catch (Exception unused) {
            return null;
        }
    }
}
