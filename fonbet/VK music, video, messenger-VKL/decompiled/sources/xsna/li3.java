package xsna;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.vk.archive.impl.ArchiveWithChannelsFragment;
import com.vk.archive.impl.channels.ArchiveChannelsFragment;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.ui.fragments.SimpleDialogsFilterFragment;

/* compiled from: ArchivePagerAdapter.kt */
/* loaded from: classes15.dex */
public final class li3 extends scs {
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final int o;

    public li3(ArchiveWithChannelsFragment archiveWithChannelsFragment, boolean z, boolean z2, boolean z3) {
        super(archiveWithChannelsFragment);
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.n ? 2 : 1;
    }

    @Override // xsna.scs
    public final Fragment z0(int i) {
        if (i == 0) {
            SimpleDialogsFilterFragment.a aVar = new SimpleDialogsFilterFragment.a(DialogsFilter.ARCHIVE);
            aVar.j.putBoolean("extra_toolbar_enabled", false);
            return aVar.f();
        }
        if (i != this.o) {
            throw new IllegalArgumentException(tgw.b(i, "position = ", " not supported"));
        }
        g2v.c().getClass();
        ArchiveChannelsFragment.a aVar2 = new ArchiveChannelsFragment.a(ArchiveChannelsFragment.class, null, null);
        Bundle bundle = aVar2.j;
        bundle.putBoolean("channels_renamed", this.l);
        bundle.putBoolean("show_channel_item_as_default_dialog", this.m);
        return aVar2.f();
    }
}
