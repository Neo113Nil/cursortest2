package xsna;

import android.os.Build;
import android.view.View;
import android.widget.CheckBox;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.dto.stories.model.clickable.ClickableVideo;
import com.vk.profile.questions.impl.AnswerSource;
import com.vk.profile.questions.impl.d;
import com.vk.stat.scheme.SchemeStat$TypeQuestionItem;
import com.vkontakte.android.R;
import xsna.ept0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class fn9 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fn9(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        fpt0 fpt0Var;
        switch (this.b) {
            case 0:
                MasksWrap masksWrap = (MasksWrap) this.c;
                CameraUIView cameraUIView = (CameraUIView) this.d;
                float f = CameraUIView.w1;
                o9e clipsGalleryListWrapper = masksWrap.getClipsGalleryListWrapper();
                if (clipsGalleryListWrapper != null) {
                    defpackage.e eVar = new defpackage.e(cameraUIView, 11);
                    defpackage.f fVar = new defpackage.f(cameraUIView, 7);
                    RecyclerView recyclerView = clipsGalleryListWrapper.a;
                    if (anj.a(recyclerView.getContext(), Build.VERSION.SDK_INT >= 33 ? "android.permission.READ_MEDIA_IMAGES" : "android.permission.READ_EXTERNAL_STORAGE") != 0) {
                        cvk.u(R.string.vk_permissions_storage_settings, false);
                        break;
                    } else {
                        clipsGalleryListWrapper.d.d().w0().h().f(recyclerView.getContext(), new p9e(clipsGalleryListWrapper, eVar, fVar), new i9e(o9e.c(clipsGalleryListWrapper.g), r1));
                        break;
                    }
                }
                break;
            case 1:
                qkc qkcVar = (qkc) this.c;
                ClickableVideo clickableVideo = (ClickableVideo) this.d;
                gzs<Boolean> gzsVar = qkcVar.d.h;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                qkcVar.m(clickableVideo);
                g2v.c().k().w(view.getContext(), "https://" + a0a.d + "/video" + clickableVideo.e.b + '_' + clickableVideo.f, "story");
                break;
            case 2:
                com.vk.profile.questions.impl.e eVar2 = (com.vk.profile.questions.impl.e) this.c;
                d.c cVar = (d.c) this.d;
                eVar2.l.e(cVar, AnswerSource.STORY_REPLY);
                iqe0.a(cVar, SchemeStat$TypeQuestionItem.Type.REPLY);
                break;
            default:
                ept0.a aVar = (ept0.a) this.c;
                izs izsVar = (izs) this.d;
                CheckBox checkBox = aVar.m;
                fpt0 fpt0Var2 = aVar.n;
                checkBox.setSelected(!(fpt0Var2 != null && fpt0Var2.c));
                fpt0 fpt0Var3 = aVar.n;
                if (fpt0Var3 != null) {
                    fpt0Var = new fpt0(fpt0Var3.b, (fpt0Var3.c ? 1 : 0) ^ 1);
                } else {
                    fpt0Var = null;
                }
                izsVar.invoke(fpt0Var);
                break;
        }
    }
}
