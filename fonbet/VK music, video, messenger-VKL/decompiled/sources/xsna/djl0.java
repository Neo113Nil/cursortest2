package xsna;

import com.vk.dto.common.id.UserId;
import org.json.JSONObject;

/* compiled from: StoreSetActive.java */
/* loaded from: classes15.dex */
public final class djl0 extends xsg0 {
    public final /* synthetic */ int s = 2;

    public /* synthetic */ djl0(String str) {
        super(str);
    }

    @Override // xsna.xsg0
    /* renamed from: F0 */
    public Boolean a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                return Boolean.TRUE;
            default:
                return super.a(jSONObject);
        }
    }

    @Override // xsna.xsg0, xsna.oer0, xsna.k7r0
    public /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                return Boolean.TRUE;
            default:
                return super.a(jSONObject);
        }
    }

    public djl0(int i, UserId userId) {
        super("wall.pin");
        C(i, "post_id");
        F(userId, "owner_id");
    }

    public djl0(int i, boolean z) {
        super(z ? "store.activateProduct" : "store.deactivateProduct");
        K("type", "stickers");
        C(i, "product_id");
    }
}
