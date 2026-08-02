package xsna;

import android.view.View;
import com.vk.core.util.measure.ScaleType;
import com.vk.dto.common.Attachment;
import com.vk.feed.tool.view.posting.preview.attachment.PreviewAttachmentWrapper;
import com.vk.newsfeed.posting.impl.presentation.base.view.steps.step1.views.RemoveButtonType;
import com.vkontakte.android.attachments.VideoAttachment;
import xsna.a1u0;

/* compiled from: VideoHolder.kt */
/* loaded from: classes4.dex */
public final class mps0 extends ce6 implements blc0 {
    public final com.vk.newsfeed.common.recycler.holders.i e;
    public a1u0 f;
    public final mwf0 g;
    public final zjc0 h;
    public x64 i;

    public mps0(PreviewAttachmentWrapper previewAttachmentWrapper, com.vk.newsfeed.common.recycler.holders.i iVar, boolean z, a1u0 a1u0Var, ScaleType scaleType) {
        super(previewAttachmentWrapper);
        this.e = iVar;
        this.f = a1u0Var;
        this.g = new mwf0(previewAttachmentWrapper, new sg0(this, 19), RemoveButtonType.VIDEO);
        zjc0 zjc0Var = new zjc0(previewAttachmentWrapper, new a1u0.a(false));
        previewAttachmentWrapper.setOnSpinnerErrorClick(new i8n0(this, 8));
        previewAttachmentWrapper.setOnSpinnerCancelClick(new prq0(this, 11));
        this.h = zjc0Var;
        if (!z) {
            iVar.a0 = this;
            s6o s6oVar = iVar.q;
            if (s6oVar != null) {
                iVar.b0 = s6oVar.a(this, s6oVar.e);
            }
            iVar.o7();
        }
        iVar.e0 = scaleType;
        iVar.N.setScaleType(scaleType);
    }

    @Override // xsna.blc0
    public final void D1(boolean z) {
        this.g.a(z);
    }

    @Override // xsna.blc0
    public final void Z1(x64 x64Var) {
        this.i = x64Var;
    }

    @Override // xsna.ce6
    public final void m(Attachment attachment) {
        boolean z = attachment instanceof VideoAttachment;
        com.vk.newsfeed.common.recycler.holders.i iVar = this.e;
        if (z) {
            iVar.Y = false;
            iVar.b7(attachment);
        }
        iVar.s7(false);
    }

    @Override // xsna.ce6, android.view.View.OnClickListener
    public final void onClick(View view) {
        x64 x64Var = this.i;
        if (x64Var != null) {
            x64Var.a(this.c);
        } else {
            super.onClick(view);
        }
    }

    @Override // xsna.blc0
    public final void p5() {
    }

    @Override // xsna.blc0
    public final void j1(View.OnClickListener onClickListener) {
    }
}
