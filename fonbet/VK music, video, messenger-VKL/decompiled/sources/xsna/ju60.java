package xsna;

import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemColorDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderActionDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderActionOpenModalBaseDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderButtonDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderImageDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderTextDto;
import com.vk.api.generated.photos.dto.PhotosPhotoSizesDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.ThemedColor;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.feed.core.models.Text;
import com.vk.feed.core.models.actions.ActionOpenBestFriendsPosting;
import com.vk.feed.core.models.actions.ActionOpenCopyright;
import com.vk.feed.core.models.actions.ActionOpenGeoFeed;
import com.vk.feed.core.models.actions.ActionOpenModal;
import com.vk.feed.core.models.actions.ActionRemote;
import com.vk.feed.core.models.actions.HeaderAction;
import java.util.List;
import java.util.Map;

/* compiled from: NewsfeedNewsfeedItemHeaderActionDtoToHeaderActionMapper.kt */
/* loaded from: classes3.dex */
public final class ju60 {

    /* compiled from: NewsfeedNewsfeedItemHeaderActionDtoToHeaderActionMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NewsfeedNewsfeedItemHeaderActionDto.TypeDto.values().length];
            try {
                iArr[NewsfeedNewsfeedItemHeaderActionDto.TypeDto.OPEN_MODAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NewsfeedNewsfeedItemHeaderActionDto.TypeDto.OPEN_COPYRIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NewsfeedNewsfeedItemHeaderActionDto.TypeDto.REMOTE_ACTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NewsfeedNewsfeedItemHeaderActionDto.TypeDto.BEST_FRIEND_POSTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NewsfeedNewsfeedItemHeaderActionDto.TypeDto.OPEN_GEO_FEED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static HeaderAction a(NewsfeedNewsfeedItemHeaderActionDto newsfeedNewsfeedItemHeaderActionDto, Map map) {
        ActionOpenModal.ModalImage modalImage;
        ActionOpenModal.OverlayImage overlayImage;
        Text text;
        ActionOpenModal.ModalButton modalButton;
        NewsfeedNewsfeedItemHeaderButtonDto d;
        ThemedColor themedColor;
        NewsfeedNewsfeedItemHeaderTextDto g;
        NewsfeedNewsfeedItemHeaderImageDto f;
        NewsfeedNewsfeedItemHeaderImageDto e;
        Image a2;
        int i = a.$EnumSwitchMapping$0[newsfeedNewsfeedItemHeaderActionDto.f().ordinal()];
        ThemedColor themedColor2 = null;
        if (i != 1) {
            if (i == 2) {
                return new ActionOpenCopyright();
            }
            if (i == 3) {
                BaseLinkButtonActionDto e2 = newsfeedNewsfeedItemHeaderActionDto.e();
                return new ActionRemote(e2 != null ? wf6.b(e2) : null);
            }
            if (i == 4) {
                return new ActionOpenBestFriendsPosting();
            }
            if (i != 5) {
                return null;
            }
            return new ActionOpenGeoFeed();
        }
        NewsfeedNewsfeedItemHeaderActionOpenModalBaseDto d2 = newsfeedNewsfeedItemHeaderActionDto.d();
        if (d2 == null || (e = d2.e()) == null) {
            modalImage = null;
        } else {
            UserId i2 = e.i();
            Owner owner = (i2 == null || map == null) ? null : (Owner) map.get(i2);
            String e3 = e.e();
            if (owner == null || (a2 = owner.g) == null) {
                List<PhotosPhotoSizesDto> g2 = e.g();
                a2 = g2 != null ? elg.a(g2) : null;
            }
            modalImage = new ActionOpenModal.ModalImage(e3, a2);
        }
        NewsfeedNewsfeedItemHeaderActionOpenModalBaseDto d3 = newsfeedNewsfeedItemHeaderActionDto.d();
        if (d3 == null || (f = d3.f()) == null) {
            overlayImage = null;
        } else {
            String f2 = f.f();
            String e4 = f.e();
            List<PhotosPhotoSizesDto> g3 = f.g();
            overlayImage = new ActionOpenModal.OverlayImage(f2, e4, g3 != null ? elg.a(g3) : null);
        }
        NewsfeedNewsfeedItemHeaderActionOpenModalBaseDto d4 = newsfeedNewsfeedItemHeaderActionDto.d();
        String title = d4 != null ? d4.getTitle() : null;
        NewsfeedNewsfeedItemHeaderActionOpenModalBaseDto d5 = newsfeedNewsfeedItemHeaderActionDto.d();
        if (d5 == null || (g = d5.g()) == null) {
            text = null;
        } else {
            String e5 = g.e();
            NewsfeedNewsfeedItemColorDto d6 = g.d();
            text = new Text(e5, d6 != null ? elg.b(d6) : null);
        }
        NewsfeedNewsfeedItemHeaderActionOpenModalBaseDto d7 = newsfeedNewsfeedItemHeaderActionDto.d();
        if (d7 == null || (d = d7.d()) == null) {
            modalButton = null;
        } else {
            NewsfeedNewsfeedItemHeaderTextDto f3 = d.f();
            String e6 = f3.e();
            NewsfeedNewsfeedItemColorDto d8 = f3.d();
            if (d8 != null) {
                String e7 = d8.e();
                Integer a3 = e7 != null ? io.reactivex.rxjava3.internal.operators.mixed.n.a("#", e7) : null;
                String d9 = d8.d();
                themedColor = new ThemedColor(a3, d9 != null ? io.reactivex.rxjava3.internal.operators.mixed.n.a("#", d9) : null);
            } else {
                themedColor = null;
            }
            Text text2 = new Text(e6, themedColor);
            HeaderAction a4 = a(d.d(), map);
            NewsfeedNewsfeedItemColorDto e8 = d.e();
            if (e8 != null) {
                String e9 = e8.e();
                Integer a5 = e9 != null ? io.reactivex.rxjava3.internal.operators.mixed.n.a("#", e9) : null;
                String d10 = e8.d();
                themedColor2 = new ThemedColor(a5, d10 != null ? io.reactivex.rxjava3.internal.operators.mixed.n.a("#", d10) : null);
            }
            modalButton = new ActionOpenModal.ModalButton(text2, a4, themedColor2);
        }
        return new ActionOpenModal(modalImage, overlayImage, title, text, modalButton);
    }
}
