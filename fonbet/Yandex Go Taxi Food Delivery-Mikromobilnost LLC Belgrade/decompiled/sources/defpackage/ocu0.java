package defpackage;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.images.utils.ScaleMode;
import com.yandex.messaging.core.net.entities.StickerPacksData;
import com.yandex.messaging.internal.images.b;

/* loaded from: classes15.dex */
public final class ocu0 extends RecyclerView.Adapter {
    public final Context a;
    public final xav b;
    public ucu0 c;
    public hhs0 w;

    public ocu0(Activity activity, xav xavVar) {
        this.a = activity;
        this.b = xavVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ucu0 ucu0Var = this.c;
        if (ucu0Var == null) {
            return 0;
        }
        return ucu0Var.a.c.getCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        ykn0 ykn0Var;
        ncu0 ncu0Var = (ncu0) x0Var;
        ncu0Var.P.c(ncu0Var.N);
        yn50 yn50Var = ncu0Var.U;
        if (yn50Var != null) {
            yn50Var.a();
            ncu0Var.U = null;
        }
        ucu0 ucu0Var = this.c;
        ncu0Var.T = i;
        vcu0 vcu0Var = ucu0Var.a;
        vcu0 vcu0Var2 = ucu0Var.a;
        vcu0Var.c.moveToPosition(i);
        Cursor cursor = vcu0Var2.c;
        if (cvu0.x(cursor.getString(1), "local/", false)) {
            zfi0 zfi0Var = new zfi0(vcu0Var2.a);
            new fcu0();
            ykn0Var = new ykn0(20, zfi0Var);
        } else {
            StickerPacksData.PackData packData = new StickerPacksData.PackData();
            packData.packId = vcu0Var2.c.getString(3);
            packData.coverId = cursor.getString(1);
            packData.title = cursor.getString(4);
            packData.description = cursor.getString(5);
            new fcu0();
            ykn0Var = new ykn0(21, packData);
        }
        mcu0 mcu0Var = new mcu0(ncu0Var);
        int i2 = ykn0Var.a;
        Object obj = ykn0Var.b;
        ncu0 ncu0Var2 = mcu0Var.a;
        switch (i2) {
            case 20:
                ncu0Var2.N.setImageResource(((zfi0) obj).a);
                ncu0Var2.N.setScaleType(ImageView.ScaleType.CENTER);
                break;
            default:
                StickerPacksData.PackData packData2 = (StickerPacksData.PackData) obj;
                String str = packData2.coverId;
                if (str != null) {
                    String str2 = ncu0Var2.S;
                    ImageView imageView = ncu0Var2.N;
                    if (!str.equals(str2)) {
                        imageView.setImageDrawable(null);
                    }
                    g9v load = ncu0Var2.P.load(b.f(packData2.coverId));
                    int i3 = ncu0Var2.Q;
                    yn50 yn50Var2 = (yn50) load;
                    xn50 xn50Var = yn50Var2.b;
                    xn50Var.i = i3;
                    xn50Var.j = i3;
                    xn50Var.f = true;
                    xn50Var.k = ScaleMode.FIT_CENTER;
                    ncu0Var2.U = yn50Var2;
                    yn50Var2.b(imageView, new lcu0(mcu0Var));
                    break;
                }
                break;
        }
        ncu0Var.S = vcu0Var2.c.getString(3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ncu0 ncu0Var = new ncu0(LayoutInflater.from(this.a).inflate(olh0.msg_vh_emoji_sticker_pack_item, viewGroup, false), this.b);
        ncu0Var.R = this.w;
        return ncu0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(x0 x0Var) {
        ncu0 ncu0Var = (ncu0) x0Var;
        ncu0Var.P.c(ncu0Var.N);
        yn50 yn50Var = ncu0Var.U;
        if (yn50Var != null) {
            yn50Var.a();
            ncu0Var.U = null;
        }
    }
}
