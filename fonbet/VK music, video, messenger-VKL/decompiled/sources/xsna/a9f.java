package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetTemplateExtendedResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetTemplateFieldsDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.dto.common.clips.ClipAudioTemplate;
import com.vkontakte.android.R;
import java.util.Collections;
import xsna.h7u0;
import xsna.lgj0;

/* compiled from: ClipsTemplatesEditorProviderImpl.kt */
/* loaded from: classes.dex */
public final class a9f implements v8f {
    public final boolean a;
    public io.reactivex.rxjava3.disposables.c b;

    public a9f(boolean z) {
        this.a = z;
    }

    @Override // xsna.v8f
    public final io.reactivex.rxjava3.core.x<ShortVideoGetTemplateExtendedResponseDto> a(Context context, String str) {
        return hg1.n(rsg0.w0(yfb.x(l370.j().D(str, Collections.singletonList(ShortVideoGetTemplateFieldsDto.AUDIOS)))), context, false, null, 62);
    }

    @Override // xsna.v8f
    public final void b(View view, m7f m7fVar) {
        Activity c = g2u0.c(view);
        if (c == null || g620.f().k0().a(c)) {
            return;
        }
        hg1.f(this.b);
        io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.single.r(a(view.getContext(), m7fVar.a()), new o40(new dh5(this, 9), 10)).subscribe(new qz(new q66(this, view, m7fVar, 2), 10), new bf2(new yad(this, 8), 11));
        itg0.b(view, subscribe);
        this.b = subscribe;
    }

    @Override // xsna.v8f
    public final void c(Context context, Throwable th, final String str, final izs<? super String, s3q0> izsVar) {
        h7u0.a c;
        VKApiExecutionException vKApiExecutionException = th instanceof VKApiExecutionException ? (VKApiExecutionException) th : null;
        if (vKApiExecutionException == null || vKApiExecutionException.s() != 100) {
            h03.b(th);
            return;
        }
        int i = h7u0.p;
        dhr0.a.getClass();
        c = h7u0.b.c(new ContextThemeWrapper(context, dhr0.u().c));
        c.g0(R.string.clips_template_editor_origin_deleted_title);
        c.U(R.string.clips_template_editor_origin_deleted_message);
        c.c0(R.string.clips_template_editor_origin_deleted_delete_draft, new DialogInterface.OnClickListener() { // from class: xsna.w8f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
                v53 v53Var = new v53(8, str, izsVar);
                clipsDraftPersistentStore.getClass();
                ClipsDraftPersistentStore.o(v53Var);
            }
        });
        c.W(R.string.clips_template_editor_origin_deleted_cancel, new ss8(2));
        c.m();
    }

    @Override // xsna.v8f
    public final void d(View view, ClipAudioTemplate clipAudioTemplate, ShortVideoGetTemplateExtendedResponseDto shortVideoGetTemplateExtendedResponseDto, String str) {
        Activity c = g2u0.c(view);
        if (c == null || g620.f().k0().a(c)) {
            return;
        }
        hg1.f(this.b);
        io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.single.r(hg1.n(rsg0.w0(yfb.x(lgj0.a.d(l370.j(), Collections.singletonList(clipAudioTemplate.zb()), null, 62))), view.getContext(), false, null, 62).l(new e40(new y8(11), 6)), new com.vk.movika.sdk.base.flow.binding.c(new g5b(this, str), 14)).subscribe(new cw(new go3(clipAudioTemplate, this, view, shortVideoGetTemplateExtendedResponseDto, 2), 13), new ew(new z8f(this, 0), 13));
        itg0.b(view, subscribe);
        this.b = subscribe;
    }
}
