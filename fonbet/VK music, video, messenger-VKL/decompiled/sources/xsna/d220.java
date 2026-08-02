package xsna;

import android.content.Context;
import com.vk.dto.music.Playlist;
import com.vk.dto.stories.model.SimpleStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.im.engine.models.dialogs.FoldersSupportedType;
import com.vk.im.ui.components.theme_chooser.ThemeChooserState;
import com.vk.libvideo.ui.VideoHidePollView;
import com.vk.log.L;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerState;
import com.vk.video.ad.g;
import com.vk.voip.ui.VoipViewModelState;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import one.video.controls20.SimpleControlsView;
import org.json.JSONObject;
import xsna.tj50;
import xsna.vd70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class d220 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ d220(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object failure;
        boolean z = false;
        int i = 1;
        switch (this.b) {
            case 0:
                qgi0.r((tgi0) obj, "community:friends:banner:go");
                return s3q0.a;
            case 1:
                List list = (List) ((xpp) obj).a();
                if (list != null) {
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((rpm) it.next()).c == FolderType.CHANNELS) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 2:
                if (!((Boolean) obj).booleanValue()) {
                    k720 k720Var = k720.a;
                    k720.Y(new IOException("Network required"));
                    io.reactivex.rxjava3.disposables.c cVar = k720.D;
                    if (cVar == null || cVar.h()) {
                        com.vk.core.utils.newtork.b.a.getClass();
                        k720.D = com.vk.core.utils.newtork.b.f().subscribe(new m20(new z410(2), 27));
                    }
                }
                return s3q0.a;
            case 3:
                return ((FoldersSupportedType) obj).h();
            case 4:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 5:
                return s3q0.a;
            case 6:
                return ((Playlist) obj).m;
            case 7:
                return Boolean.valueOf(((MusicPickerState) obj).m);
            case 8:
                tj50.a aVar = (tj50.a) obj;
                od70 od70Var = od70.b;
                ao8 ao8Var = ao8.d;
                return new vd70.a(aVar.a(od70Var, ao8Var), aVar.a(pd70.b, ao8Var), aVar.a(qd70.b, ao8Var), aVar.a(rd70.b, ao8Var), aVar.a(sd70.b, ao8Var), aVar.a(td70.b, ao8Var));
            case 9:
                return s3q0.a;
            case 10:
                return s3q0.a;
            case 11:
                String[] strArr = PostViewFragment.T0;
                return s3q0.a;
            case 12:
                return io.reactivex.rxjava3.internal.operators.observable.g0.b;
            case 13:
                qgi0.r((tgi0) obj, "errorTitle");
                return s3q0.a;
            case 14:
                return s3q0.a;
            case 15:
                L.i((Throwable) obj);
                return s3q0.a;
            case 16:
                SimpleControlsView simpleControlsView = new SimpleControlsView((Context) obj, null, 0, 14, 0);
                simpleControlsView.setButtonsVisibilityList(EmptyList.b);
                return simpleControlsView;
            case 17:
                return Boolean.valueOf(((StoriesContainer) obj) instanceof SimpleStoriesContainer);
            case 18:
                List<hvu> list3 = ((u4m0) obj).a;
                ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                Iterator<T> it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((hvu) it2.next()).a);
                }
                return arrayList;
            case 19:
                return ((com.vk.stories.design.view.stats.tabs.viewers.mvi.j) obj).h;
            case 20:
                try {
                    JSONObject optJSONObject = new JSONObject((String) obj).optJSONObject("proxy_config");
                    failure = optJSONObject != null ? optJSONObject.toString() : null;
                    if (failure == null) {
                        failure = "";
                    }
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                return (String) (Result.a(failure) == null ? failure : "");
            case 21:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 22:
                return ThemeChooserState.a((ThemeChooserState) obj, ThemeChooserState.ListKind.BACKGROUND, null, null, null, false, null, null, null, 254);
            case 23:
                return Float.valueOf(((vkr0) obj).b);
            case 24:
                xtw xtwVar = (xtw) obj;
                return ((io.reactivex.rxjava3.core.q) xtwVar.b).L(new nit(new zvd(xtwVar.a, i), 23), false);
            case 25:
                return new g.a(((tj50.a) obj).a(uzr0.b, ao8.d));
            case 26:
                int i2 = VideoHidePollView.w;
                return s3q0.a;
            case 27:
                return ((com.vk.video.ui.discovery.minimizable.q) obj).w;
            case 28:
                return s3q0.a;
            default:
                return Boolean.valueOf(!((VoipViewModelState) obj).h());
        }
    }
}
