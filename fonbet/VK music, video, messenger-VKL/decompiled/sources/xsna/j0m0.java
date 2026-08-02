package xsna;

import android.content.Intent;
import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.media.entities.CameraPhotoParameters;
import com.vk.story.api.domain.interactor.upload.StoryMultiData;
import com.vkontakte.android.data.b;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.json.JSONArray;
import xsna.kr5;

/* compiled from: StoryChoosePresenter.kt */
/* loaded from: classes6.dex */
public final class j0m0 implements cc6 {
    public final uvl0 b;
    public final b4h c;
    public i0m0 d;
    public Intent e;
    public CommonUploadParams f;
    public StoryMultiData g;
    public CameraPhotoParameters h;
    public UserId i;
    public boolean j;
    public final LinkedHashSet k;
    public boolean l;
    public boolean m;
    public tb5 n;
    public final HashMap<UserId, Collection<Narrative>> o;

    public j0m0(uvl0 uvl0Var, b4h b4hVar) {
        this.b = uvl0Var;
        this.c = b4hVar;
        UserId userId = UserId.d;
        this.i = userId;
        this.k = new LinkedHashSet();
        this.l = true;
        cn o = o25.a().o();
        kr5.a aVar = new kr5.a(new wx4(o));
        s3q0 s3q0Var = s3q0.a;
        this.n = new tb5(userId, aVar.a(), o.b, false, false, false);
        this.o = new HashMap<>();
    }

    public final void b(boolean z) {
        b.d dVar = new b.d("stories_send_screen");
        if (z) {
            dVar.b("go_back", "action");
        } else {
            dVar.b("send", "action");
        }
        JSONArray jSONArray = new JSONArray();
        if (this.l) {
            jSONArray.put("my_story");
        }
        LinkedHashSet linkedHashSet = this.k;
        if (!linkedHashSet.isEmpty()) {
            jSONArray.put("send_via_message");
        }
        if (this.h != null) {
            dVar.b("photo", "type");
        } else {
            dVar.b("video", "type");
        }
        dVar.b(jSONArray, "action_facts");
        dVar.b(Integer.valueOf(linkedHashSet.size()), "recipients_count");
        dVar.h();
    }

    @Override // xsna.cc6
    public final void onDestroy() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onPause() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onResume() {
        throw null;
    }
}
