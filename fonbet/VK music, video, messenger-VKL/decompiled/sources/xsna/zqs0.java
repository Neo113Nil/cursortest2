package xsna;

import android.content.DialogInterface;
import com.vk.catalog.mvi.block.BlockId;
import xsna.wqs0;
import xsna.xqs0;

/* compiled from: VideoLargeListEventHandler.kt */
/* loaded from: classes16.dex */
public final class zqs0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ xqs0.i b;
    public final /* synthetic */ izs c;

    public zqs0(xqs0.i iVar, izs izsVar) {
        this.b = iVar;
        this.c = izsVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        BlockId blockId = this.b.a;
        if (blockId instanceof BlockId.CompositeId) {
            this.c.invoke(new wqs0.m((BlockId.CompositeId) blockId));
        }
    }
}
