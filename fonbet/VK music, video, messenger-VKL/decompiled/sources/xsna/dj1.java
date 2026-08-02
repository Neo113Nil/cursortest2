package xsna;

import android.content.Context;
import android.os.Parcel;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.api.generated.groups.dto.GroupsAddressDto;
import com.vk.api.generated.groups.dto.GroupsGetAddressesResponseDto;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.cell.button.group.VkCellButtonGroupLayout;
import com.vk.core.view.components.cell.button.group.VkGroupItem;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.dto.common.VideoFile;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.superapp.vkpay.checkout.data.model.GooglePay;
import com.vk.toggle.b;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vk.voip.ui.broadcast.fragments.config.BroadcastConfigFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Result;
import org.json.JSONObject;
import xsna.bbv0;
import xsna.cue;
import xsna.dob;
import xsna.dug0;
import xsna.jsn;
import xsna.knb;
import xsna.o3b;
import xsna.tlo0;
import xsna.vre;
import xsna.web;
import xsna.xxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class dj1 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ dj1(int i) {
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v105, types: [java.lang.Object, java.util.List] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        JSONObject a;
        Object failure;
        switch (this.b) {
            case 0:
                PhotoAlbum photoAlbum = (PhotoAlbum) obj;
                Parcel obtain = Parcel.obtain();
                try {
                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                    Serializer.g gVar = new Serializer.g(obtain);
                    gVar.i0(photoAlbum);
                    obtain.setDataPosition(0);
                    Serializer.StreamParcelable G = gVar.G(PhotoAlbum.class.getClassLoader());
                    obtain.recycle();
                    PhotoAlbum photoAlbum2 = (PhotoAlbum) G;
                    photoAlbum2.f++;
                    return photoAlbum2;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            case 1:
                return Boolean.valueOf(!epx.f((xxd0) obj, xxd0.c.a));
            case 2:
                L.i((Throwable) obj);
                return s3q0.a;
            case 3:
                int i = BroadcastConfigFragment.U;
                return Boolean.valueOf(((it80) obj).a != 0);
            case 4:
                ((b.d) obj).b("video", "story_type");
                return s3q0.a;
            case 5:
                Context context = (Context) obj;
                VkCellButtonGroupLayout vkCellButtonGroupLayout = new VkCellButtonGroupLayout(context, null, 6);
                vkCellButtonGroupLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                for (int i2 = 0; i2 < 3; i2++) {
                    VkGroupItem vkGroupItem = new VkGroupItem(context, null, 6);
                    vkGroupItem.setText("Button");
                    VkGroupItem.a(vkGroupItem, Integer.valueOf(R.drawable.vk_icon_attach_24));
                    VkGroupItem.b(vkGroupItem, Integer.valueOf(R.drawable.vk_icon_dropdown_outline_16), VkGroupItem.IconType.Dropdown, 2);
                    vkGroupItem.setCount(1);
                    vkGroupItem.setCounterAppearance(VkCounter.CounterAppearance.Appearance.Accent);
                    vkGroupItem.setCounterMode(VkCounter.Mode.Primary);
                    vkGroupItem.setOnClickListener(new o44(0));
                    vkCellButtonGroupLayout.addView(vkGroupItem, vkCellButtonGroupLayout.generateLayoutParams((AttributeSet) null));
                }
                return vkCellButtonGroupLayout;
            case 6:
                o3b.a aVar = (o3b.a) obj;
                return new o5b(aVar.c, aVar.a, aVar.d);
            case 7:
                web webVar = (web) obj;
                if (!(webVar instanceof web.b) && !(webVar instanceof web.a) && !(webVar instanceof web.d) && !(webVar instanceof web.c)) {
                    r2 = false;
                }
                return Boolean.valueOf(r2);
            case 8:
                return Long.valueOf(((j0b) obj).b);
            case 9:
                knb.a aVar2 = (knb.a) obj;
                DialogExt dialogExt = aVar2.b;
                VideoFile videoFile = aVar2.c;
                Dialog Cb = dialogExt.Cb();
                return new dob.c(dialogExt, videoFile, (Cb == null || !Cb.Gb() || Cb.Jc()) ? false : true, aVar2.d);
            case 10:
                return Boolean.valueOf(((dug0.c) obj).c());
            case 11:
                qdd.e.compareAndSet(true, false);
                return s3q0.a;
            case 12:
                b.a aVar3 = (b.a) obj;
                return (aVar3 == null || (a = puq.a(aVar3)) == null) ? sgd.c : new sgd(true, a.optBoolean("use_for_transcoder", false));
            case 13:
                ((TextView) obj).setTextSize(11.0f);
                return s3q0.a;
            case 14:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 15:
                Integer num = ((vre.c) obj).g;
                int intValue = num != null ? num.intValue() : 0;
                tlo0.a aVar4 = tlo0.Companion;
                Object[] objArr = {xpm0.a(intValue)};
                aVar4.getClass();
                return tlo0.a.a(R.plurals.clips_playlist_ui_clips, intValue, objArr);
            case 16:
                return cue.a.c.a;
            case 17:
                String str = ClipsUploadFragmentImpl.a0;
                return s3q0.a;
            case 18:
                return Float.valueOf(((Float) obj).floatValue() * 100.0f);
            case 19:
                h03.b((Throwable) obj);
                return s3q0.a;
            case 20:
                qgi0.r((tgi0) obj, "DescriptionTextField");
                return s3q0.a;
            case 21:
                List<GroupsAddressDto> d = ((GroupsGetAddressesResponseDto) obj).d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                Iterator<T> it = d.iterator();
                while (it.hasNext()) {
                    arrayList.add(fz5.v((GroupsAddressDto) it.next()));
                }
                return arrayList;
            case 22:
                return s3q0.a;
            case 23:
                return Boolean.valueOf(((vzh) obj).s);
            case 24:
                PublishState publishState = (PublishState) obj;
                return PublishState.a(publishState, null, null, k2k.b(publishState), null, false, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, false, false, null, false, false, null, false, false, false, false, -5, 2047);
            case 25:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return ((Context) obj).getString(R.string.vkim_dialog_archive);
            case 26:
                return Boolean.valueOf(((File) obj).isDirectory());
            case 27:
                zk70.e((Throwable) obj);
                return s3q0.a;
            case 28:
                return new n05(((jen) obj).h);
            default:
                if (((Boolean) obj).booleanValue()) {
                    bbv0.g.getClass();
                    if (!bbv0.a.f().b.g) {
                        failure = GooglePay.c;
                        return new Result(failure);
                    }
                }
                failure = new Result.Failure(new jsn.a());
                return new Result(failure);
        }
    }

    public /* synthetic */ dj1(Object obj, int i) {
        this.b = i;
    }
}
