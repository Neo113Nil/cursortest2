package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.soloader.MinElf;
import com.vk.bridges.di.BridgeComponent;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.shortvideo.entries.ClipsGridHeaderEntry;
import kotlin.Pair;
import xsna.o0r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class yee implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ Object e;

    public /* synthetic */ yee(Object obj, ViewGroup viewGroup, Object obj2, int i) {
        this.b = i;
        this.c = obj;
        this.d = viewGroup;
        this.e = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                ((BridgeComponent) ((afe) this.c).u.getValue()).F().m(((VkCell) this.d).getContext(), ((ClipsGridHeaderEntry.Author) this.e).a, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                break;
            default:
                ((onj) this.c).invoke(this.d, ((Pair) this.e).i());
                break;
        }
    }
}
