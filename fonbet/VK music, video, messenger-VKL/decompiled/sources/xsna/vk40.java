package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.dto.newsfeed.entries.Post;
import com.vkontakte.android.fragments.SettingsListFragment;
import xsna.b960;
import xsna.c5i;
import xsna.lwq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class vk40 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vk40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [com.vk.pushes.PushAwareActivity, xsna.l4o0$b] */
    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                ((h440) this.c).invoke(obj);
                break;
            case 1:
                ((azt) this.c).invoke(obj);
                break;
            case 2:
                ((zj50) this.c).invoke(obj);
                break;
            case 3:
                ((h440) this.c).invoke(obj);
                break;
            case 4:
                ((zf1) this.c).invoke(obj);
                break;
            case 5:
                ((b960.b) this.c).invoke(obj);
                break;
            case 6:
                ((sg60) this.c).e((vf60) obj);
                break;
            case 7:
                Post post = (Post) this.c;
                if (((BaseOkResponseDto) obj).i() == BaseOkResponseDto.OK.i()) {
                    post.uc(false);
                    ce60.b.getClass();
                    p870.f().e(155, post);
                    break;
                }
                break;
            case 8:
                ((boc) this.c).invoke(obj);
                break;
            case 9:
                ((ne70) this.c).invoke(obj);
                break;
            case 10:
                ((m8) this.c).invoke(obj);
                break;
            case 11:
                ((h440) this.c).invoke(obj);
                break;
            case 12:
                ((h440) this.c).invoke(obj);
                break;
            case 13:
                ((q8) this.c).invoke(obj);
                break;
            case 14:
                ((azt) this.c).invoke(obj);
                break;
            case 15:
                ((zf1) this.c).invoke(obj);
                break;
            case 16:
                ((lxo) this.c).invoke(obj);
                break;
            case 17:
                ((h440) this.c).invoke(obj);
                break;
            case 18:
                ((azt) this.c).invoke(obj);
                break;
            case 19:
                v2j0 v2j0Var = (v2j0) this.c;
                int i = SettingsListFragment.X0;
                v2j0Var.invoke(obj);
                break;
            case 20:
                ((h440) this.c).invoke(obj);
                break;
            case 21:
                ((h440) this.c).invoke(obj);
                break;
            case 22:
                l4o0 l4o0Var = (l4o0) this.c;
                l4o0Var.i = !l4o0Var.i;
                ?? r3 = l4o0Var.h;
                if (r3 != 0) {
                    r3.o0();
                    break;
                }
                break;
            case 23:
                ((h440) this.c).invoke(obj);
                break;
            case 24:
                ((h440) this.c).invoke(obj);
                break;
            case 25:
                ((h440) this.c).invoke(obj);
                break;
            case 26:
                dsq0 dsq0Var = (dsq0) this.c;
                if (((c5i) obj) instanceof c5i.a) {
                    dsq0Var.a(lwq0.c.g.b);
                    break;
                }
                break;
            case 27:
                ((e9i0) this.c).invoke(obj);
                break;
            case 28:
                ((eyp0) this.c).invoke(obj);
                break;
            default:
                ((tv7) this.c).invoke(obj);
                break;
        }
    }
}
