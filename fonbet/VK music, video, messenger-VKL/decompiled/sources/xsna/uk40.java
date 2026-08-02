package xsna;

import com.vk.channels.api.Channel;
import com.vk.channels.impl.donut.ChannelDonutSupportFragment;
import com.vk.channels.impl.post_settings.g;
import com.vk.dto.common.id.UserId;
import com.vk.voip.VoipCallActivity;
import xsna.ab60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class uk40 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uk40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((ju) obj2).invoke(obj);
                break;
            case 1:
                ((ml1) obj2).invoke(obj);
                break;
            case 2:
                ((ab60.b) obj2).invoke(obj);
                break;
            case 3:
                ((py60) obj2).w((Throwable) obj);
                break;
            case 4:
                ((n43) obj2).invoke(obj);
                break;
            case 5:
                ((wq80) obj2).invoke(obj);
                break;
            case 6:
                ((ju) obj2).invoke(obj);
                break;
            case 7:
                ((fa00) obj2).invoke(obj);
                break;
            case 8:
                ((ju) obj2).invoke(obj);
                break;
            case 9:
                ((pqz) obj2).invoke(obj);
                break;
            case 10:
                com.vk.channels.impl.post_settings.b bVar = (com.vk.channels.impl.post_settings.b) obj2;
                Channel channel = (Channel) obj;
                if (!channel.L || !channel.p) {
                    bVar.n(new g.d(new UserId(channel.A.d), new UserId(channel.b)));
                    break;
                } else {
                    Channel b = bVar.o.b();
                    if (b != null) {
                        new ChannelDonutSupportFragment.a(new UserId(b.A.d)).l(bVar.h);
                        break;
                    }
                }
                break;
            case 11:
                ((pqz) obj2).invoke(obj);
                break;
            case 12:
                ((re10) obj2).invoke(obj);
                break;
            case 13:
                ((wv2) obj2).invoke(obj);
                break;
            case 14:
                ((fa00) obj2).invoke(obj);
                break;
            case 15:
                ((pqz) obj2).invoke(obj);
                break;
            case 16:
                ((pqz) obj2).invoke(obj);
                break;
            case 17:
                ((izs) obj2).invoke(obj);
                break;
            case 18:
                ((ju) obj2).invoke(obj);
                break;
            case 19:
                ((sf4) obj2).invoke(obj);
                break;
            case 20:
                ((xlq0) obj2).invoke(obj);
                break;
            case 21:
                ((s8r0) obj2).invoke(obj);
                break;
            case 22:
                ((u5p0) obj2).invoke(obj);
                break;
            case 23:
                ((ito0) obj2).invoke(obj);
                break;
            case 24:
                ((yf1) obj2).invoke(obj);
                break;
            case 25:
                ((u5p0) obj2).invoke(obj);
                break;
            case 26:
                ((ght0) obj2).invoke(obj);
                break;
            case 27:
                ((u5p0) obj2).invoke(obj);
                break;
            case 28:
                int i2 = VoipCallActivity.P;
                ((u5p0) obj2).invoke(obj);
                break;
            default:
                ((u5p0) obj2).invoke(obj);
                break;
        }
    }
}
