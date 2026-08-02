package xsna;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.util.Size;
import com.vk.vmoji.character.VmojiCharacterFragment;
import com.vk.vmoji.character.model.VmojiProductModel;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import com.yandex.div.internal.util.Clock;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import xsna.ikv0;
import xsna.mhi0;
import xsna.xv6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class lhi0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ lhi0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        int i = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                Uri uri = (Uri) obj3;
                Map map = (Map) obj2;
                JSONObject jSONObject = (JSONObject) obj;
                mhi0.a aVar = ((mhi0) obj4).c;
                aVar.getClass();
                long currentTimeMs = Clock.get().getCurrentTimeMs();
                bpn0 bpn0Var = aVar.a;
                mhi0.b bVar = (mhi0.b) bpn0Var.getValue();
                jhi0 jhi0Var = bVar.b;
                jhi0Var.getClass();
                ContentValues contentValues = new ContentValues(3);
                contentValues.put("url", uri.toString());
                if (map.isEmpty()) {
                    str = null;
                } else {
                    StringBuilder sb = new StringBuilder();
                    for (Map.Entry entry : map.entrySet()) {
                        String str2 = (String) entry.getKey();
                        String str3 = (String) entry.getValue();
                        sb.append(str2);
                        sb.append('\t');
                        sb.append(str3);
                        sb.append((char) 0);
                    }
                    str = sb.toString();
                }
                contentValues.put("headers", str);
                contentValues.put("add_timestamp", Long.valueOf(currentTimeMs));
                SQLiteDatabase writableDatabase = jhi0Var.getWritableDatabase();
                try {
                    long insert = writableDatabase.insert("items", null, contentValues);
                    writableDatabase.close();
                    bVar.c.push(new xv6.a(uri, map, jSONObject, currentTimeMs, insert));
                    bVar.c();
                    uri.toString();
                    int i2 = mhi0.d;
                    throw null;
                } finally {
                }
            case 1:
                y7w0 y7w0Var = (y7w0) obj4;
                ikv0.a aVar2 = new ikv0.a(y7w0Var.c);
                aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_on_24, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) null, 12);
                aVar2.u = new ikv0.d((String) obj3, (String) null, (ikv0.d.a) null, 6);
                aVar2.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, y7w0Var.c.getString(R.string.vmoji_character_buy_snackbar_edit), new ync(y7w0Var, (String) obj2, (VmojiProductModel) obj, 12));
                aVar2.o = Integer.valueOf(cn70.b(8));
                aVar2.e = TimeUnit.SECONDS.toMillis(2L);
                VmojiCharacterFragment vmojiCharacterFragment = y7w0Var.a;
                aVar2.f = vmojiCharacterFragment.getView();
                aVar2.p(vmojiCharacterFragment.kn().getWindow());
                return;
            default:
                ((yads.co1) obj4).c((yads.do1) obj3, (yads.wg1) obj2, (yads.in1) obj);
                return;
        }
    }
}
