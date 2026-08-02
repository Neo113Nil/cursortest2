package io.reactivex.rxjava3.subjects;

import android.net.Uri;
import androidx.preference.Preference;
import com.google.common.collect.ImmutableList;
import com.vk.api.generated.account.dto.AccountGetMultiResponseDto;
import com.vk.api.generated.apps.dto.AppsGamesCatalogDto;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogItemPayloadListDto;
import com.vk.api.generated.audio.dto.AudioPhotoDto;
import com.vk.api.generated.audioBooks.dto.AudioBooksGetAudioBookByIdResponseDto;
import com.vk.api.generated.auth.dto.AuthExternalFlowOutResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.esia.dto.EsiaGetEsiaUserInfoResponseDto;
import com.vk.api.generated.gifts.dto.GiftsGetResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.market.dto.MarketGetAlbumsResponseDto;
import com.vk.api.generated.market.dto.MarketGetCommentsResponseDto;
import com.vk.api.generated.messages.dto.MessagesEnumerateBackgroundsResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetTemplatesResponseDto;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.yandex.div.internal.parser.ValueValidator;
import io.reactivex.rxjava3.functions.l;
import io.reactivex.rxjava3.internal.operators.single.f0;
import io.reactivex.rxjava3.internal.operators.single.v;
import io.reactivex.rxjava3.internal.util.f;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.gl.tf.factory.FaceMeshFactory;
import ru.ok.tensorflow.util.Function;
import xsna.asu0;
import xsna.b03;
import xsna.by1;
import xsna.dug0;
import xsna.f03;
import xsna.g8l;
import xsna.h7d;
import xsna.ihz;
import xsna.qhz;
import xsna.szs;
import xsna.wwx;
import xsna.xtp0;
import xsna.xul0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class c implements b03, f03, l, Preference.b, ihz.a, ValueValidator, Function, szs {
    public final /* synthetic */ int b;

    public /* synthetic */ c(int i) {
        this.b = i;
    }

    public static int a(ProfilesSimpleInfo profilesSimpleInfo, int i, int i2) {
        return (profilesSimpleInfo.hashCode() + i) * i2;
    }

    public static f0 b(asu0 asu0Var, v vVar) {
        asu0Var.getClass();
        return vVar.q(asu0.i());
    }

    public static String c(String str, Uri uri, char c) {
        return str + uri + c;
    }

    public static /* synthetic */ boolean d(AtomicReference atomicReference, f.a aVar) {
        while (!atomicReference.compareAndSet(null, aVar)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        DebugDevSettingsFragment.jo();
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        Float lambda$create$0;
        switch (this.b) {
            case 10:
                return ((h7d) obj).a;
            case 16:
                return Optional.of((GroupsGetByIdObjectResponseDto) obj);
            case 18:
                lambda$create$0 = FaceMeshFactory.lambda$create$0((Float) obj);
                return lambda$create$0;
            case 23:
                return ((dug0.c) obj).c;
            default:
                return ImmutableList.m(qhz.e(((androidx.media3.exoplayer.source.h) obj).getTrackGroups().b, new xul0(3)));
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 1:
                return (AccountGetMultiResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AccountGetMultiResponseDto.class).getType())).a();
            case 2:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 3:
                return (AppsMiniappsCatalogItemPayloadListDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AppsMiniappsCatalogItemPayloadListDto.class).getType())).a();
            case 17:
                return (EsiaGetEsiaUserInfoResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, EsiaGetEsiaUserInfoResponseDto.class).getType())).a();
            case 21:
                return (GiftsGetResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, GiftsGetResponseDto.class).getType())).a();
            case 27:
                return (MessagesGetTemplatesResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MessagesGetTemplatesResponseDto.class).getType())).a();
            default:
                return (BaseBoolIntDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 4:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppsGamesCatalogDto.class).getType());
            case 5:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AudioBooksGetAudioBookByIdResponseDto.class).getType());
            case 6:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AudioPhotoDto.class).getType());
            case 7:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AuthExternalFlowOutResponseDto.class).getType());
            case 8:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType());
            case 22:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 24:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketGetCommentsResponseDto.class).getType());
            case 25:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketGetAlbumsResponseDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesEnumerateBackgroundsResponseDto.class).getType());
        }
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((by1) obj).getClass();
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        Long l = (Long) obj;
        switch (this.b) {
            case 13:
                if (l.longValue() >= 0) {
                }
                break;
            case 14:
                if (l.longValue() > 0) {
                }
                break;
            default:
                if (l.longValue() >= 0) {
                }
                break;
        }
        return false;
    }

    public /* synthetic */ c(Object obj, int i) {
        this.b = i;
    }

    public /* synthetic */ c(by1.a aVar, g8l g8lVar) {
        this.b = 12;
    }
}
