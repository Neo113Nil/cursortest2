package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog.mvi.block.video.impl.video.list.c;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.video.channel.common.AuthorCommentsSelectorArguments;
import com.vk.video.channel.common.di.VideoChannelComponent;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class qe20 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ qe20(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        boolean z;
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                break;
            case 1:
                n6d0 n6d0Var = (n6d0) obj2;
                nod0 nod0Var = (nod0) obj;
                Integer m = arm0.m(10, String.valueOf(((VkInputSelect) obj3).getText()));
                Integer valueOf = m != null ? Integer.valueOf(m.intValue() * 100) : null;
                p6d0 p6d0Var = n6d0Var.f;
                n6d0Var.f = p6d0Var != null ? new p6d0(valueOf, p6d0Var.b) : new p6d0(2, valueOf, null);
                nod0Var.l.invoke(n6d0Var);
                break;
            case 2:
                String str = (String) obj;
                StringBuilder sb = new StringBuilder("uid=");
                sb.append(((UserId) obj3).b);
                sb.append("; mid=");
                MusicTrack musicTrack = (MusicTrack) j5g.a0((List) obj2);
                sb.append(musicTrack != null ? musicTrack.Fb() : null);
                sb.append("; pid=");
                if (str == null) {
                    str = "-2147483648";
                }
                sb.append(str);
                break;
            case 3:
                acs0 acs0Var = (acs0) obj3;
                Context context = (Context) obj2;
                String str2 = (String) obj;
                acs0Var.getClass();
                int i2 = ify.a;
                ify.e(ify.c);
                while (true) {
                    z = context instanceof FragmentActivity;
                    if (!z && (context instanceof ContextWrapper)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (((FragmentActivity) (z ? (Activity) context : null)) != null) {
                    xas0 h4 = ((VideoChannelComponent) acs0Var.l.getValue()).h4();
                    new AuthorCommentsSelectorArguments(str2);
                    h4.getClass();
                }
                break;
            default:
                ((izs) obj3).invoke(new c.a(((vst0) obj2).b, p490.C((tny) ((bpf0) obj).a())));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ qe20(acs0 acs0Var, u3g0 u3g0Var, Context context, String str) {
        this.b = 3;
        this.c = acs0Var;
        this.d = context;
        this.e = str;
    }
}
