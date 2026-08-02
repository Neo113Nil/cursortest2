package xsna;

import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import io.jsonwebtoken.JwtParser;
import java.util.Arrays;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import xsna.swa;
import xsna.tlo0;

/* compiled from: ChannelControlsVh.kt */
/* loaded from: classes2.dex */
public final class uwa extends vfz<swa> {
    public static final int o = iah0.a(48);
    public final leb l;
    public final VkCell m;
    public swa n;

    /* compiled from: ChannelControlsVh.kt */
    public static final class a implements VkCell.f {
        public final Integer a;

        public a() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            Integer num = this.a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return uqi.b(new StringBuilder("ChannelControlIconParams(iconRes="), this.a, ')');
        }

        public a(Integer num) {
            this.a = num;
        }
    }

    public uwa(View view, leb lebVar) {
        super(view);
        this.l = lebVar;
        VkCell vkCell = (VkCell) this.itemView.findViewById(R.id.channel_select_subscribers_cell);
        this.m = vkCell;
        bwt0.i0(this.itemView, new g60(this, 19));
        vkCell.c(new v7(13), new twa((byte) 0, 0));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(swa swaVar) {
        a aVar;
        String string;
        swa swaVar2 = swaVar;
        this.n = swaVar2;
        a aVar2 = new a(Integer.valueOf(R.drawable.vk_icon_users_circle_fill_blue_48));
        if (swaVar2 instanceof swa.a) {
            string = this.itemView.getContext().getString(R.string.vkim_channel_control_all);
            aVar = new a(null);
        } else {
            if (!(swaVar2 instanceof swa.b)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = aVar2;
            string = this.itemView.getContext().getString(R.string.vkim_channel_control_subscribers);
        }
        VkCell.Middle.b bVar = new VkCell.Middle.b(new VkCell.Middle.e(oq.d(tlo0.Companion, string), 1, TextUtils.TruncateAt.MARQUEE, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), (VkCell.Middle.d) null, (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 14);
        VkCell vkCell = this.m;
        vkCell.setMiddle(bVar);
        VkCell.Right.c cVar = VkCell.Right.Companion;
        int W5 = swaVar2.W5();
        tlo0.h hVar = new tlo0.h(W5 >= 1000 ? String.format(Locale.getDefault(), "%.1fК", Arrays.copyOf(new Object[]{Double.valueOf(W5 / 1000.0d)}, 1)).replace(JwtParser.SEPARATOR_CHAR, ',') : String.valueOf(W5));
        vkCell.setRight(VkCell.Right.c.a(cVar, new VkCell.Right.a.e(hVar, hVar), null, null, null, 30));
        int i = o;
        vkCell.setLeft(new VkCell.Left.b(new VkCell.Left.Main.e(aVar, new Size(i, i)), new VkCell.Left.c.a(4, new eb(this, 8), swaVar2.p())));
    }
}
