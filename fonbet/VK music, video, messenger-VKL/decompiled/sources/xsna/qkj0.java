package xsna;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import com.vk.cameraui.ShutterStates;
import com.vk.content.design.view.camera.ShutterButton;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.e3m;

/* compiled from: ShutterItemProviderImpl.kt */
/* loaded from: classes16.dex */
public final class qkj0 implements pkj0 {
    public static final int a = iah0.a(1);

    /* compiled from: ShutterItemProviderImpl.kt */
    public static final class a {
        public static final ShutterButton.d a(Context context) {
            int i = qkj0.a;
            ShutterButton.d dVar = new ShutterButton.d();
            dVar.a = context.getString(R.string.camera_ui_live_start);
            dVar.h = false;
            int i2 = qkj0.a;
            Rect rect = dVar.c;
            rect.top = i2;
            dVar.o = true;
            dVar.n = true;
            rect.left = iah0.a(64.0f);
            rect.right = iah0.a(64.0f);
            dVar.p = context.getColor(R.color.camera_ui_live_button1);
            dVar.s = context.getColor(R.color.vk_white);
            dVar.v = context.getString(R.string.story_accessibility_start_live);
            dVar.i = 0;
            return dVar;
        }

        public static final ShutterButton.d b() {
            int i = qkj0.a;
            ShutterButton.d dVar = new ShutterButton.d();
            dVar.h = false;
            dVar.q = 0;
            return dVar;
        }

        public static final ShutterButton.d c(Context context) {
            int i = qkj0.a;
            ShutterButton.d dVar = new ShutterButton.d();
            e3m.a aVar = e3m.a;
            dVar.p = context.getColor(R.color.vk_white);
            dVar.c.top = qkj0.a;
            float f = 16;
            dVar.b = uko.a(context, R.drawable.ic_camera_red_circle, iah0.a(f), iah0.a(f));
            dVar.v = context.getString(R.string.story_accessibility_take_video);
            return dVar;
        }

        public static final ShutterButton.d d(Context context) {
            int i = qkj0.a;
            ShutterButton.d dVar = new ShutterButton.d();
            dVar.q = 0;
            dVar.c.top = qkj0.a;
            float f = 24;
            dVar.b = uko.a(context, R.drawable.ic_red_rectangle, iah0.a(f), iah0.a(f));
            dVar.r = true;
            dVar.v = context.getString(R.string.clips_stop_record);
            return dVar;
        }
    }

    /* compiled from: ShutterItemProviderImpl.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoryCameraMode.values().length];
            try {
                iArr[StoryCameraMode.LIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoryCameraMode.STORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoryCameraMode.PING_PONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StoryCameraMode.REVERSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StoryCameraMode.PHOTO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StoryCameraMode.VIDEO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StoryCameraMode.STORY_VIDEO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[StoryCameraMode.QR_SCANNER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[StoryCameraMode.CLIPS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[StoryCameraMode.VMOJI_CAPTURE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.pkj0
    public final void a(Context context, StoryCameraMode storyCameraMode, StoryCameraParams storyCameraParams, ArrayList arrayList, Map map) {
        int i = b.$EnumSwitchMapping$0[storyCameraMode.ordinal()];
        int i2 = a;
        switch (i) {
            case 1:
                ShutterButton.d a2 = a.a(context);
                arrayList.add(a2);
                map.put(ShutterStates.LIVE, a2);
                ShutterButton.d dVar = new ShutterButton.d();
                dVar.h = false;
                dVar.o = true;
                dVar.c.top = i2;
                dVar.p = context.getColor(R.color.camera_ui_live_button1);
                dVar.s = context.getColor(R.color.vk_white);
                arrayList.add(dVar);
                map.put(ShutterStates.START_LIVE, dVar);
                ShutterButton.d a3 = a.a(context);
                a3.a = "";
                a3.e = true;
                a3.f = ShutterButton.N;
                a3.r = true;
                a3.v = context.getString(R.string.story_accessibility_loading_live);
                arrayList.add(a3);
                map.put(ShutterStates.LIVE_LOADING, a3);
                return;
            case 2:
                ShutterButton.d dVar2 = new ShutterButton.d();
                dVar2.q = 120;
                dVar2.c.top = i2;
                dVar2.v = context.getString(R.string.story_accessibility_take_photo);
                arrayList.add(dVar2);
                map.put(ShutterStates.STORY, dVar2);
                ShutterButton.d b2 = a.b();
                arrayList.add(b2);
                map.put(ShutterStates.EMPTY, b2);
                return;
            case 3:
                ShutterButton.d dVar3 = new ShutterButton.d();
                dVar3.b = BitmapFactory.decodeResource(context.getResources(), R.drawable.vk_icon_ic_loop_28);
                dVar3.c.top = i2;
                uko.a(context, R.drawable.bg_shutter_stop, iah0.a(18.0f), iah0.a(18.0f));
                dVar3.v = context.getString(R.string.story_accessibility_take_ping_pong);
                dVar3.x = false;
                arrayList.add(dVar3);
                map.put(ShutterStates.LOOP, dVar3);
                ShutterButton.d dVar4 = new ShutterButton.d();
                float f = 24;
                dVar4.b = uko.a(context, R.drawable.ic_red_rectangle, iah0.a(f), iah0.a(f));
                dVar4.c.top = i2;
                dVar4.r = true;
                dVar4.q = 0;
                dVar4.x = false;
                arrayList.add(dVar4);
                map.put(ShutterStates.SEND_LOOP_STOP, dVar4);
                ShutterButton.d dVar5 = new ShutterButton.d();
                dVar5.h = false;
                dVar5.e = true;
                dVar5.r = true;
                dVar5.g = ShutterButton.M;
                arrayList.add(dVar5);
                map.put(ShutterStates.SEND_LOOP_PROCESSING, dVar5);
                ShutterButton.d b3 = a.b();
                arrayList.add(b3);
                map.put(ShutterStates.EMPTY, b3);
                return;
            case 4:
                ShutterButton.d dVar6 = new ShutterButton.d();
                dVar6.b = BitmapFactory.decodeResource(context.getResources(), R.drawable.vk_icon_chevrons_2_left_outline_28);
                dVar6.c.top = i2;
                arrayList.add(dVar6);
                map.put(ShutterStates.REVERSE, dVar6);
                ShutterButton.d b4 = a.b();
                arrayList.add(b4);
                map.put(ShutterStates.EMPTY, b4);
                return;
            case 5:
                ShutterButton.d dVar7 = new ShutterButton.d();
                dVar7.q = 120;
                dVar7.c.top = i2;
                arrayList.add(dVar7);
                map.put(ShutterStates.PHOTO, dVar7);
                ShutterButton.d b5 = a.b();
                arrayList.add(b5);
                map.put(ShutterStates.EMPTY, b5);
                if (storyCameraParams.R) {
                    return;
                }
                dVar7.l = 17;
                dVar7.c.right = 0;
                return;
            case 6:
                ShutterButton.d c = a.c(context);
                arrayList.add(c);
                map.put(ShutterStates.VIDEO, c);
                ShutterButton.d d = a.d(context);
                arrayList.add(d);
                map.put(ShutterStates.VIDEO_RECORDING, d);
                ShutterButton.d b6 = a.b();
                arrayList.add(b6);
                map.put(ShutterStates.EMPTY, b6);
                return;
            case 7:
                ShutterButton.d c2 = a.c(context);
                arrayList.add(c2);
                map.put(ShutterStates.STORY_VIDEO, c2);
                ShutterButton.d d2 = a.d(context);
                arrayList.add(d2);
                map.put(ShutterStates.VIDEO_RECORDING, d2);
                ShutterButton.d b7 = a.b();
                arrayList.add(b7);
                map.put(ShutterStates.EMPTY, b7);
                return;
            case 8:
                ShutterButton.d b8 = a.b();
                arrayList.add(b8);
                map.put(ShutterStates.EMPTY, b8);
                return;
            case 9:
                ShutterButton.d c3 = a.c(context);
                arrayList.add(c3);
                map.put(ShutterStates.STORY_VIDEO, c3);
                ShutterButton.d d3 = a.d(context);
                arrayList.add(d3);
                map.put(ShutterStates.VIDEO_RECORDING, d3);
                ShutterButton.d dVar8 = new ShutterButton.d();
                dVar8.h = false;
                dVar8.e = true;
                dVar8.r = true;
                dVar8.g = ShutterButton.M;
                arrayList.add(dVar8);
                map.put(ShutterStates.SEND_LOOP_PROCESSING, dVar8);
                ShutterButton.d b9 = a.b();
                arrayList.add(b9);
                map.put(ShutterStates.SEND_CLIP_MULTIPLE_EMPTY, b9);
                return;
            case 10:
                ShutterButton.d dVar9 = new ShutterButton.d();
                dVar9.q = 120;
                dVar9.c.top = i2;
                arrayList.add(dVar9);
                map.put(ShutterStates.PHOTO, dVar9);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
