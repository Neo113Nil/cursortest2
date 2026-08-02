package xsna;

import com.vk.api.generated.donut.dto.DonutCheckCensoredValidateResponseDto;
import com.vk.clips.sdk.models.ActionLinkSnippet;
import com.vk.clips.sdk.models.ActionLinkSnippetIcon;
import com.vk.clips.sdk.models.ImageUrl;
import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.sdk.models.SdkImages;
import com.vk.clips.viewer.impl.adapters.VideoFileAdapter;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.actionlinks.SnippetStyle;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.log.L;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vk.voip.ui.sessionrooms.f;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.f9k0;
import xsna.wwi0;
import xsna.ywi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class h3e0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ h3e0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        ActionLinkSnippet actionLinkSnippet;
        String str2;
        String str3;
        Object obj2;
        boolean z = false;
        switch (this.b) {
            case 0:
                qgi0.m((tgi0) obj, t1e0.d);
                return s3q0.a;
            case 1:
                return Boolean.valueOf(((sy40) obj).e.f);
            case 2:
                return ((g6n0) obj).getId();
            case 3:
                wwi0 wwi0Var = (wwi0) obj;
                f.a.b a = xwi0.a(((wwi0.b.C3961b) wwi0Var.e).a);
                Collection<wwi0.c.C3962c> collection = wwi0Var.c;
                ArrayList arrayList = new ArrayList(c5g.u(collection, 10));
                Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    arrayList.add(xwi0.a((wwi0.c.C3962c) it.next()));
                }
                return new ywi0.b.a(a, arrayList);
            case 4:
                return s3q0.a;
            case 5:
                L.i((Throwable) obj);
                return s3q0.a;
            case 6:
                return s3q0.a;
            case 7:
                L.i((Throwable) obj);
                return s3q0.a;
            case 8:
                qgi0.r((tgi0) obj, "memories_banner_open");
                return s3q0.a;
            case 9:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 10:
                List<String> d = ((DonutCheckCensoredValidateResponseDto) obj).d();
                boolean z2 = true;
                if (d != null) {
                    List<String> list = d;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        for (String str4 : list) {
                            if (!epx.f(str4, "0") && !drm0.N(str4)) {
                                z2 = z;
                            }
                        }
                    }
                    z = true;
                    z2 = z;
                }
                return Boolean.valueOf(z2);
            case 11:
                return ((xxq0) obj).g.b;
            case 12:
                return PublishState.a((PublishState) obj, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, false, false, null, false, false, f9k0.b.a, false, false, false, false, -1, 2015);
            case 13:
                return obj instanceof Iterable ? (Iterable) obj : Collections.singletonList(obj);
            case 14:
                ActionLink actionLink = (ActionLink) obj;
                qcy<Object>[] qcyVarArr = VideoFileAdapter.l;
                if (actionLink == null) {
                    return null;
                }
                int i = y10.a;
                int i2 = actionLink.b;
                com.vk.dto.actionlinks.ActionLinkSnippet actionLinkSnippet2 = actionLink.f;
                if (actionLinkSnippet2 == null || (str = actionLinkSnippet2.e) == null) {
                    str = "";
                }
                String str5 = str;
                String str6 = actionLink.c;
                String str7 = actionLink.e;
                Integer num = actionLink.i;
                if (actionLinkSnippet2 != null) {
                    String str8 = actionLinkSnippet2.b;
                    String str9 = actionLinkSnippet2.c;
                    String str10 = actionLinkSnippet2.d;
                    String str11 = actionLinkSnippet2.e;
                    int i3 = actionLinkSnippet2.g;
                    int i4 = actionLinkSnippet2.h;
                    String str12 = actionLinkSnippet2.n;
                    if (str12 == null || str12.length() == 0) {
                        str12 = actionLinkSnippet2.o;
                        String str13 = actionLinkSnippet2.n;
                        if (str13 == null || str13.length() == 0) {
                            if (str12 == null || str12.length() == 0) {
                                str13 = actionLinkSnippet2.p;
                            }
                        }
                        str12 = str13;
                    }
                    String str14 = str12;
                    ImageUrl imageUrl = str14 != null ? new ImageUrl(str14, y10.a, false, 4, null) : null;
                    String zb = actionLinkSnippet2.zb();
                    SdkImages sdkImages = new SdkImages(rl3.I(new ImageUrl[]{imageUrl, zb != null ? new ImageUrl(zb, y10.b, false, 4, null) : null}), null, 2, null);
                    SnippetStyle snippetStyle = actionLinkSnippet2.i;
                    com.vk.clips.sdk.models.SnippetStyle snippetStyle2 = snippetStyle != null ? new com.vk.clips.sdk.models.SnippetStyle(snippetStyle.b, snippetStyle.c) : null;
                    String str15 = actionLinkSnippet2.k;
                    String str16 = actionLinkSnippet2.l;
                    Iterator<E> it2 = ActionLinkSnippetIcon.h().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            str2 = str15;
                            str3 = str16;
                            if (epx.f(((ActionLinkSnippetIcon) next).i(), actionLinkSnippet2.m)) {
                                obj2 = next;
                            } else {
                                str15 = str2;
                                str16 = str3;
                            }
                        } else {
                            str2 = str15;
                            str3 = str16;
                            obj2 = null;
                        }
                    }
                    actionLinkSnippet = new ActionLinkSnippet(str8, str9, str10, str11, i3, i4, sdkImages, snippetStyle2, str2, str3, (ActionLinkSnippetIcon) obj2);
                } else {
                    actionLinkSnippet = null;
                }
                return new SdkActionLink(actionLink.d, i2, str5, str6, str7, actionLinkSnippet, actionLink.g, actionLink.h, num);
            case 15:
                JSONArray optJSONArray = ((JSONObject) obj).optJSONArray("response");
                if (optJSONArray != null) {
                    return optJSONArray.optJSONObject(0);
                }
                return null;
            case 16:
                AttachmentWithMedia attachmentWithMedia = (AttachmentWithMedia) obj;
                if (attachmentWithMedia instanceof PhotoAttachment) {
                    return (PhotoAttachment) attachmentWithMedia;
                }
                return null;
            default:
                return s3q0.a;
        }
    }
}
